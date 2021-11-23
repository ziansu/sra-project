@org.junit.Test
@com.itextpdf.test.annotations.LogMessages(messages = { @com.itextpdf.test.annotations.LogMessage(messageTemplate = com.itextpdf.io.LogMessageConstant.START_MARKER_MISSING_IN_PFB_FILE) })
public void createWrongPfb() throws java.io.IOException, java.lang.InterruptedException {
    byte[] afm = com.itextpdf.io.util.StreamUtil.inputStreamToArray(new java.io.FileInputStream(((com.itextpdf.kernel.pdf.PdfFontTest.fontsFolder) + "cmr10.afm")));
    com.itextpdf.kernel.font.PdfFont font = com.itextpdf.kernel.font.PdfFontFactory.createFont(com.itextpdf.io.font.FontProgramFactory.createType1Font(afm, afm, false), null);
    byte[] streamContent = ((com.itextpdf.kernel.font.PdfType1Font) (font)).getFontProgram().getFontStreamBytes();
    org.junit.Assert.assertTrue("Empty stream content expected", (streamContent == null));
}