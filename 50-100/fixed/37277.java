@org.junit.Test
public void getsListOfAssignments() {
    cc.kave.commons.model.ssts.statements.IAssignment someAssignment = assign("foo", invoke("this", method(exec.recommender_reimplementation.pbn.PBNAnalysisTestFixture.voidType, exec.recommender_reimplementation.pbn.DefaultClassContext, "M")));
    cc.kave.commons.model.ssts.statements.IAssignment someOtherAssignment = assign("bar", constant("someValue"));
    java.util.List<cc.kave.commons.model.ssts.statements.IAssignment> expectedAssignments = com.google.common.collect.Lists.newArrayList(someAssignment, someOtherAssignment);
    cc.kave.commons.model.ssts.declarations.IMethodDeclaration methodDecl = methodDecl(exec.recommender_reimplementation.pbn.DefaultMethodContext, true, someAssignment, someOtherAssignment);
    org.junit.Assert.assertThat(exec.recommender_reimplementation.pbn.PBNAnalysisUtil.getAssignmentList(methodDecl), org.hamcrest.Matchers.is(expectedAssignments));
}