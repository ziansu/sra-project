protected void testExpression(com.trigersoft.jaque.expressions.LambdaExpressionTest.SerializablePredicate<com.trigersoft.jaque.Person> p, java.lang.String name) {
    final com.trigersoft.jaque.expression.LambdaExpression<java.util.function.Predicate<com.trigersoft.jaque.Person>> ex = com.trigersoft.jaque.expression.LambdaExpression.parse(p);
    org.junit.Assert.assertNotNull(ex);
    java.util.function.Function<java.lang.Object[], ?> le = ex.compile();
    com.trigersoft.jaque.Person t = new com.trigersoft.jaque.Person();
    t.setName(name);
    org.junit.Assert.assertEquals(p.test(t), le.apply(new java.lang.Object[]{ t }));
}