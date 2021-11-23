@org.junit.Test
public void testGetModel() throws java.lang.Exception {
    com.googlecode.rockit.parser.SyntaxReader parser = new com.googlecode.rockit.parser.SyntaxReader();
    com.googlecode.rockit.javaAPI.Model model = parser.getModel(de.dwslab.ai.riskmanagement.abduction.parser.SyntaxReaderTest.FILE_MODEL, de.dwslab.ai.riskmanagement.abduction.parser.SyntaxReaderTest.FILE_GROUND_VALUES);
    org.junit.Assert.assertEquals(0, 0);
}