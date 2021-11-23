@org.junit.Test
@com.ebay.junitnexgen.category.Category(value = { com.ebay.junitnexgen.category.Category.Groups.P1 , com.ebay.junitnexgen.category.Category.Groups.FAST , com.ebay.junitnexgen.category.Category.Groups.UNIT })
@com.ebay.junitnexgen.category.Description(value = "Method name conflict")
public void testBug8714Error() throws java.lang.Exception {
    expectProblems.clear();
    expectProblems.add(createNewProblem(MethodProbIds.AmbiguousMethod, 11, 0));
    final java.util.List<org.ebayopensource.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem> actualProblems = getVjoSemanticProblem("org.ebayopensource.dsf.jst.validation.vjo.BugFixes.", "Bug8714.js", this.getClass());
    assertProblemEquals(expectProblems, actualProblems);
}