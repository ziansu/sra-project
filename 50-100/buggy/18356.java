@org.junit.Test
public void testDirectToDFA() {
    for (java.lang.String expr : de.mkrane.finiteAutomataTools.DFATest.exprs) {
        try {
            de.mkrane.finiteAutomataTools.regularExpr.Expression e = de.mkrane.finiteAutomataTools.parser.Parser.parse(expr);
            de.mkrane.finiteAutomataTools.finiteAutomata.NFA nfa = e.toNFA(false);
            de.mkrane.finiteAutomataTools.finiteAutomata.DFA dfa_direkt = e.toDFA(false);
            org.junit.Assert.assertTrue((expr + " failed to correctly convert!"), de.mkrane.finiteAutomataTools.finiteAutomata.FiniteAutomata.sameLanguage(nfa, dfa_direkt, de.mkrane.finiteAutomataTools.DFATest.tests));
        } catch (java.lang.Exception e1) {
            e1.printStackTrace();
        }
    }
}