public static parser.pdfbox.model.PdfBoxColor create(float[] rgb) throws java.io.IOException {
    if (rgb == null) {
        rgb = new float[]{ 0 , 0 , 0 };
    }
    java.lang.String rgbStr = java.util.Arrays.toString(rgb);
    if (!(parser.pdfbox.model.PdfBoxColor.colorMap.containsKey(rgbStr))) {
        parser.pdfbox.model.PdfBoxColor.colorMap.put(rgbStr, new parser.pdfbox.model.PdfBoxColor(rgb));
    }
    return parser.pdfbox.model.PdfBoxColor.colorMap.get(rgbStr);
}