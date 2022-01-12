private org.grammaticalframework.pgf.ExprIterator doParse() throws org.grammaticalframework.pgf.ParseError {
    org.grammaticalframework.pgf.Pool pool = new org.grammaticalframework.pgf.Pool();
    long callbacksRef = org.grammaticalframework.pgf.Parser.newCallbacksMap(concr, pool);
    if ((callbacks) != null) {
        for (java.util.Map.Entry<java.lang.String, org.grammaticalframework.pgf.LiteralCallback> entry : callbacks.entrySet()) {
            org.grammaticalframework.pgf.Parser.addLiteralCallback(concr, callbacksRef, entry.getKey(), entry.getValue(), pool);
        }
    }
    return org.grammaticalframework.pgf.Parser.parseWithHeuristics(concr, startCat, s, heuristics, callbacksRef, pool);
}