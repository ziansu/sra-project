@org.junit.Test
public void testCastPredicateExpressionNode() {
    de.bmoth.parser.ast.nodes.CastPredicateExpressionNode node = ((de.bmoth.parser.ast.nodes.CastPredicateExpressionNode) (parseFormula("bool(FALSE)").getFormula()));
    assertEquals("bool(FALSE)", node.toString());
}