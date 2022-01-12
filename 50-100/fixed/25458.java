@org.junit.Test
public void testExistsSolutionFinder() {
    java.lang.String formula = "#x.(x : {1,2} & a = x)";
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    assertEquals(2, solutions.size());
}