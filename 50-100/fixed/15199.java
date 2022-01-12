@org.junit.Test
public void testExpressionOperatorNode() {
    de.bmoth.parser.ast.nodes.ExpressionOperatorNode node = ((de.bmoth.parser.ast.nodes.ExpressionOperatorNode) (parseFormula("1**1").getFormula()));
    assertEquals("POWER_OF(1,1)", node.toString());
    node.setOperator(ExpressionOperatorNode.ExpressionOperator.TRUE);
    node.setExpressionList(new java.util.ArrayList<>());
    assertEquals("TRUE", node.toString());
    assertEquals(ExpressionOperator.DOMAIN, ExpressionOperatorNode.ExpressionOperator.valueOf("DOMAIN"));
}