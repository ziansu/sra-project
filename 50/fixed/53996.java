public void testConvertToExtensionAndRename() throws java.lang.Exception {
    org.jetbrains.kotlin.idea.refactoring.changeSignature.JetChangeInfo changeInfo = getChangeInfo();
    changeInfo.setReceiverParameterInfo(changeInfo.getNewParameters()[0]);
    changeInfo.setNewName("foo1");
    doTest(changeInfo, true);
}