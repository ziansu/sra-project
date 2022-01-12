@java.lang.Override
protected void initializeSolver() {
    solver = getSolver();
    solver.initialize();
    z3Solver = ((jkind.solvers.z3.Z3Solver) (solver));
    for (jkind.sexp.Symbol e : ivcMap.values()) {
        z3Solver.define(new jkind.lustre.VarDecl(e.str, jkind.lustre.NamedType.BOOL));
    }
}