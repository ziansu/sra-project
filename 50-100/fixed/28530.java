@org.junit.Test
public void testPredicateOperatorWithExprArgsNode() {
    de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode equalNode = ((de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode) (parseFormula("x = 1").getFormula()));
    de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode otherNode = ((de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode) (parseFormula("x <= 1").getFormula()));
    assertEquals("EQUAL(x,1)", equalNode.toString());
    assertEquals("LESS_EQUAL(x,1)", otherNode.toString());
    otherNode.setOperator(PredicateOperatorWithExprArgsNode.PredOperatorExprArgs.GREATER_EQUAL);
    assertEquals("GREATER_EQUAL(x,1)", otherNode.toString());
}