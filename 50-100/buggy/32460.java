public void addPredicate(org.exist.xquery.Predicate pred) {
    final org.exist.xquery.Expression e = ((org.exist.xquery.Expression) (steps.get(((steps.size()) - 1))));
    if (e instanceof org.exist.xquery.Step) {
        ((org.exist.xquery.Step) (e)).addPredicate(pred);
    }
}