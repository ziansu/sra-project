@org.junit.Test
public void testSolutionFinderNATUpper() {
    java.lang.String oneBelowMaxInt = java.lang.String.valueOf(((de.bmoth.preferences.BMothPreferences.getIntPreference(BMothPreferences.IntPreference.MAX_INT)) - 1));
    java.lang.String formula = new java.lang.StringBuilder().append("a : NAT & a > ").append(oneBelowMaxInt).toString();
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    assertEquals(1, solutions.size());
}