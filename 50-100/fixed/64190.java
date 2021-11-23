public double evalYAt(double x, double y) {
    try {
        Expression e = new ExpressionBuilder(jCompExpr).variables("x", "y").build().setVariable("x", x).setVariable("y", y);
        return e.evaluate();
    } catch (java.lang.ArithmeticException e) {
        return 0;
    }
}