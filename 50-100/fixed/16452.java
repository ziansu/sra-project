public colorfill.solver.Solution call() throws java.lang.Exception {
    try {
        solver.execute(this.startPos);
        return solver.getSolution();
    } finally {
        final java.lang.String info = solver.getSolverInfo();
        if ((null != info) && (0 != (info.length()))) {
            java.lang.System.out.println(info);
        }
    }
}