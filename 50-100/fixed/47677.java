@org.junit.Test
public void checkFile_convertsRedPenErrorsIntoIDEAProblemDescriptors() throws java.lang.Exception {
    cc.redpen.model.Document doc = redPen.parse(DocumentParser.PLAIN, "Hello");
    when(redPen.validate(doc)).thenReturn(java.util.Arrays.asList(errorGenerator.at(0, 3), errorGenerator.at(3, 5)));
    com.intellij.codeInspection.ProblemDescriptor[] problems = inspection.checkFile(mockPsiFile("Hello"), mock(com.intellij.codeInspection.InspectionManager.class), true);
    assertNotNull(problems);
    assertEquals(2, problems.length);
}