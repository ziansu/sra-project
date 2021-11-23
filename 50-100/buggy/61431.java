@java.lang.Override
protected java.lang.Void call() throws java.lang.Exception {
    try {
        if (this.solver.backtracking()) {
            java.lang.System.out.println("Success!");
        }
        display(this.solver.getVariables());
        java.lang.System.out.println("done");
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
    return null;
}