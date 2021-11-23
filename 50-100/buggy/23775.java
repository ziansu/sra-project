public static jkind.sexp.Sexp getNextStepConjunctedAssertions(jkind.lustre.Node node) {
    jkind.translation.Lustre2Sexp visitor = new jkind.translation.Lustre2Sexp(1);
    java.util.List<jkind.sexp.Sexp> conjuncts = new java.util.ArrayList<>();
    for (jkind.lustre.Expr assertion : node.assertions) {
        conjuncts.add(assertion.accept(visitor));
    }
    return jkind.util.SexpUtil.conjoin(conjuncts);
}