public jkind.solvers.Result quickCheckSat(java.util.List<jkind.sexp.Symbol> activationLiterals) {
    send(new jkind.sexp.Cons("check-sat", activationLiterals));
    markDone();
    java.lang.String status = readFromSolver();
    if (isSat(status)) {
        return new jkind.solvers.SatResult();
    }else
        if (isUnsat(status)) {
            return new jkind.solvers.UnsatResult();
        }else {
            return new jkind.solvers.UnknownResult();
        }
    
}