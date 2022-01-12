private void init(java.lang.String name, fr.ccouturi.HealthChecker... checkers) {
    this.name = name;
    this.checkers = new java.util.ArrayList(checkers.length);
    runnables = new java.util.ArrayList<java.lang.Runnable>(checkers.length);
    for (fr.ccouturi.HealthChecker checker : checkers) {
        this.checkers.add(checker);
        runnables.add(checker);
    }
}