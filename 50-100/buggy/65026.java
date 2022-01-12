@org.junit.Test
public void testSolutionFinderNATUpperFail() {
    java.lang.String maxInt = java.lang.String.valueOf(de.bmoth.preferences.BMothPreferences.getIntPreference(BMothPreferences.IntPreference.MAX_INT));
    java.lang.String formula = new java.lang.StringBuilder().append("a : NAT & a > ").append(maxInt).toString();
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    org.junit.Assert.assertEquals(0, solutions.size());
}