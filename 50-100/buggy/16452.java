public colorfill.solver.Solution call() throws java.lang.Exception {
    solver.execute(this.startPos);
    final java.lang.String info = solver.getSolverInfo();
    if ((null != info) && (false == (info.isEmpty()))) {
        java.lang.System.out.println(info);
    }
    return solver.getSolution();
}