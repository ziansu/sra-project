public static org.apache.pdfbox.pdmodel.font.PDType0Font load(org.apache.pdfbox.pdmodel.PDDocument doc, org.apache.fontbox.ttf.TrueTypeFont ttf, boolean embedSubset) throws java.io.IOException {
    return new org.apache.pdfbox.pdmodel.font.PDType0Font(doc, ttf, embedSubset, true);
}