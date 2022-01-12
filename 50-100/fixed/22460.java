@org.junit.Test
public void testSolutionFinderNAT1Upper() {
    java.lang.String formula = "a : NATURAL1 & a < 2";
    de.bmoth.backend.translator.BoolExpr constraint = de.bmoth.backend.z3.FormulaToZ3Translator.translatePredicate(formula, z3Context);
    java.util.Set<de.bmoth.backend.translator.Model> solutions = finder.findSolutions(constraint, 20);
    assertEquals(1, solutions.size());
}