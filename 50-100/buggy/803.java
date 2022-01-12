@org.junit.Test
public void fromConstructor() {
    cc.catalysts.boot.report.pdf.config.PdfTextStyle config = new cc.catalysts.boot.report.pdf.config.PdfTextStyle("10,Times-Roman,#000000");
    org.junit.Assert.assertEquals(10, config.getFontSize());
    org.junit.Assert.assertEquals("Times-Roman", config.getFont().getBaseFont());
    org.junit.Assert.assertEquals(java.awt.Color.black, config.getColor());
}