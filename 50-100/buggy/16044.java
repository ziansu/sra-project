public static void addFonts(org.xhtmlrenderer.pdf.ITextRenderer renderer, java.lang.String pathFontDir) throws java.lang.Exception {
    java.io.File fontDir = new java.io.File(pathFontDir);
    java.io.File[] fontFiles = fontDir.listFiles();
    for (java.io.File fontFile : fontFiles) {
        renderer.getFontResolver().addFont(fontFile.getAbsolutePath(), true);
    }
}