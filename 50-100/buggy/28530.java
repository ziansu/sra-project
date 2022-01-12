@org.junit.Test
public void testPredicateOperatorWithExprArgsNode() {
    de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode equalNode = ((de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode) (parseFormula("x = 1").getFormula()));
    de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode otherNode = ((de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode) (parseFormula("x <= 1").getFormula()));
    org.junit.Assert.assertEquals("EQUAL(x,1)", equalNode.toString());
    org.junit.Assert.assertEquals("LESS_EQUAL(x,1)", otherNode.toString());
    otherNode.setOperator(PredicateOperatorWithExprArgsNode.PredOperatorExprArgs.GREATER_EQUAL);
    org.junit.Assert.assertEquals("GREATER_EQUAL(x,1)", otherNode.toString());
}