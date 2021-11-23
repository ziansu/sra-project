@org.junit.Test
public void context02Test() throws org.igor.segodin.expression.evaluator.core.parser.ParseException {
    java.lang.String string = "-x*(2+2) * (-1)";
    org.igor.segodin.expression.evaluator.core.expression.Expression expression = parser.parse(string);
    java.util.Map<java.lang.String, java.lang.Object> ctx = new java.util.HashMap<>();
    ctx.put("x", 3);
    org.junit.Assert.assertEquals(12.0, expression.evaluate(ctx));
}