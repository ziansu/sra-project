public void testExpression() throws java.lang.Exception {
    java.lang.String[] inputs = new java.lang.String[]{ "1+2" , "5+pi" , "2+x" , "x+2-2" , "-x+2" , "xx+2" , "2pi+3pi" , "2e+3pi" , "2x+3x" };
    for (java.lang.String x : inputs) {
        Expression expression = new Expression(x);
        java.lang.System.out.println(x);
        java.lang.System.out.println(expression.getSimplifiedExpression());
        java.lang.System.out.println();
    }
}