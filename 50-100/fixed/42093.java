public void testUnequalOperation1() {
    org.nlamah.QL.Model.Expression.Abstract.Expression parsedExpression = org.nlamah.QL.QLTest.produceExpressionFromString("1 != 2");
    org.nlamah.QL.Model.Expression.Literal.NumberLiteral numberLiteral1 = new org.nlamah.QL.Model.Expression.Literal.NumberLiteral(1);
    org.nlamah.QL.Model.Expression.Literal.NumberLiteral numberLiteral2 = new org.nlamah.QL.Model.Expression.Literal.NumberLiteral(2);
    org.nlamah.QL.Model.Expression.Abstract.Expression referenceExpression = new org.nlamah.QL.Model.Expression.Binary.UnEqualExpression(numberLiteral1, numberLiteral2);
    assertEquals(parsedExpression.accept(new org.nlamah.QL.Model.Expression.Evalutation.ExpressionEvaluator()), new org.nlamah.QL.Model.Expression.Literal.BooleanLiteral(true));
}