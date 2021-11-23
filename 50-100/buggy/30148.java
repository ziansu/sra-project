@org.junit.Test
@com.ebay.junitnexgen.category.Category(value = { com.ebay.junitnexgen.category.Category.Groups.P3 , com.ebay.junitnexgen.category.Category.Groups.FAST , com.ebay.junitnexgen.category.Category.Groups.UNIT })
@com.ebay.junitnexgen.category.Description(value = "Test duplicate method name ")
public void testMethodsWithSameName_4() throws java.lang.Exception {
    expectProblems.clear();
    expectProblems.add(createNewProblem(FieldProbIds.DuplicateField, 32, 0));
    expectProblems.add(createNewProblem(MethodProbIds.AmbiguousMethod, 32, 0));
    actualProblems = getVjoSemanticProblem("org.ebayopensource.dsf.jst.validation.vjo.BugFixes.", "Bug490_4.js", this.getClass());
    assertProblemEquals(expectProblems, actualProblems);
}