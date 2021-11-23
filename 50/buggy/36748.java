public boolean matchPred(int ind) {
    try {
        query.QueryCheck.predicates(schemas[ind], preds);
        return true;
    } catch (query.QueryException e) {
        java.lang.System.out.println("faileeddd!!!!!");
        return false;
    }
}