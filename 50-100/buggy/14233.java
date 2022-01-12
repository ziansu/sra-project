public static java.awt.Font getFontFromEnv(java.lang.String fontDesc, int style, int size, java.lang.String embedFontDesc) throws java.lang.Exception {
    java.awt.Font font = null;
    java.lang.String os = java.lang.System.getProperties().getProperty("os.name");
    {
        java.awt.Font orgFont = new java.awt.Font(fontDesc, style, size);
        com.itextpdf.awt.AsianFontMapper mapper = new com.itextpdf.awt.AsianFontMapper(embedFontDesc, "UniGB-UCS2-H");
        com.itextpdf.text.pdf.BaseFont basefont = mapper.awtToPdf(orgFont);
        font = new java.awt.Font(basefont, size, style);
    }
    return font;
}