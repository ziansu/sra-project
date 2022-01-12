@org.junit.Test
public void autoDetect1() throws java.io.IOException, java.lang.InterruptedException {
    byte[] afm = com.itextpdf.io.util.StreamUtil.inputStreamToArray(new java.io.FileInputStream(((com.itextpdf.kernel.pdf.PdfFontTest.fontsFolder) + "cmr10.afm")));
    org.junit.Assert.assertTrue("Type1 font expected", ((com.itextpdf.io.font.FontProgramFactory.createFont(afm, false)) instanceof com.itextpdf.io.font.Type1Font));
}