@org.junit.Test
public void testSolutionFinderNAT1UpperFail() {
    java.lang.String formula = "a : NATURAL1 & a < 1";
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    org.junit.Assert.assertEquals(0, solutions.size());
}