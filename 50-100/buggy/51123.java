@org.junit.Test
public void testQuantifiedPredicateNode() {
    de.bmoth.parser.ast.nodes.QuantifiedPredicateNode existsNode = ((de.bmoth.parser.ast.nodes.QuantifiedPredicateNode) (parseFormula("#x.(x > 0)").getFormula()));
    de.bmoth.parser.ast.nodes.QuantifiedPredicateNode forAllNode = ((de.bmoth.parser.ast.nodes.QuantifiedPredicateNode) (parseFormula("!x.(x > 0)").getFormula()));
    org.junit.Assert.assertEquals("EXISTS(x,GREATER(x,0))", existsNode.toString());
    org.junit.Assert.assertEquals("FORALL(x,GREATER(x,0))", forAllNode.toString());
    org.junit.Assert.assertEquals(QuantifiedPredicateOperator.EXISTENTIAL_QUANTIFICATION, QuantifiedPredicateNode.QuantifiedPredicateOperator.valueOf("EXISTENTIAL_QUANTIFICATION"));
}