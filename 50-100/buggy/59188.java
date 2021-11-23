@org.junit.Test
@org.junit.Ignore
public void testSatPredicateWithoutModel() throws java.io.IOException {
    java.lang.String formula = "1 < 2";
    com.microsoft.z3.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    de.bmoth.backend.z3.SolutionFinder finder = new de.bmoth.backend.z3.SolutionFinder(constraint, z3Solver, z3Context);
    java.util.Set<com.microsoft.z3.Model> solutions = finder.findSolutions(20);
    org.junit.Assert.assertEquals(1, solutions.size());
}