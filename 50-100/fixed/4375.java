public void testFunctionLiteral() throws java.lang.Exception {
    org.jetbrains.kotlin.idea.refactoring.changeSignature.JetChangeInfo changeInfo = getChangeInfo();
    changeInfo.getNewParameters()[1].setName("y1");
    changeInfo.addParameter(new org.jetbrains.kotlin.idea.refactoring.changeSignature.JetParameterInfo(changeInfo.getMethodDescriptor().getBaseDescriptor(), (-1), "x", org.jetbrains.kotlin.builtins.KotlinBuiltIns.getInstance().getAnyType(), null, null, JetValVar.None, null));
    changeInfo.setNewReturnTypeText("Int");
    doTest(changeInfo, true);
}