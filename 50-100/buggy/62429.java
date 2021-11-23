@org.junit.Test
public void testSolutionFinder4() {
    java.lang.String formula = "a > 0";
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    org.junit.Assert.assertEquals(20, solutions.size());
}