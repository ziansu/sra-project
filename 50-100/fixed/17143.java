public boolean isValidRepo() {
    java.util.List<java.lang.String> lines = null;
    try {
        lines = run("git", "rev-parse", "--is-inside-work-tree");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return ((lines != null) && ((lines.size()) > 0)) && (lines.get(0).equalsIgnoreCase("true"));
}