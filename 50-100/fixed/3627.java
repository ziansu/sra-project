public static java.util.HashMap<java.lang.String, java.lang.Integer> evaluateExpressions(java.util.HashMap<java.lang.String, simsql.compiler.MathExpression> expressions, java.util.HashMap<java.lang.String, java.lang.Integer> indices) {
    java.util.HashMap<java.lang.String, java.lang.Integer> newIndices = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    for (java.lang.String key : expressions.keySet()) {
        simsql.compiler.MathExpression e = expressions.get(key);
        simsql.compiler.MPNGenerator generator = new simsql.compiler.MPNGenerator(e);
        newIndices.put(key, generator.initializeTime(indices));
    }
    return newIndices;
}