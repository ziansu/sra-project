@org.junit.Test
public void testResolveBAT3() {
    mjchao.mazenav.logic.structures.SymbolTracker tracker = new mjchao.mazenav.logic.structures.SymbolTracker();
    java.lang.String infix = "A AND !B";
    java.util.List<mjchao.mazenav.logic.StatementCNF.Disjunction> disjunctions = mjchao.mazenav.logic.StatementCNFTest.disjunctionsFromInfix(infix, tracker);
    java.util.List<mjchao.mazenav.logic.StatementCNF.Disjunction> expected = java.util.Arrays.asList(new mjchao.mazenav.logic.StatementCNF.Disjunction());
    java.util.List<mjchao.mazenav.logic.StatementCNF.Disjunction> resolveClauses = mjchao.mazenav.logic.Resolver.resolve(disjunctions.get(0), disjunctions.get(1));
    org.junit.Assert.assertEquals(expected, resolveClauses);
}