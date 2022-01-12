@org.junit.Test
public void testDeclarationNode() {
    de.bmoth.parser.ast.nodes.DeclarationNode node = ((de.bmoth.parser.ast.nodes.IdentifierExprNode) (((de.bmoth.parser.ast.nodes.PredicateOperatorWithExprArgsNode) (parseFormula("\n  x = 1").getFormula())).getExpressionNodes().get(0))).getDeclarationNode();
    org.junit.Assert.assertEquals(2, node.getLine());
    org.junit.Assert.assertEquals(2, node.getPos());
}