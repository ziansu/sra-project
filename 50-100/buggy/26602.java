public java.util.List<jkind.sexp.Symbol> getUnsatCore() {
    java.util.List<jkind.sexp.Symbol> unsatCore = new java.util.ArrayList<>();
    send("(get-unsat-core)");
    for (java.lang.String s : readCore().split(" ")) {
        if (!(s.isEmpty())) {
            unsatCore.add(new jkind.sexp.Symbol(s));
        }
    }
    return unsatCore;
}