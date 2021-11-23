public static parser.pdfbox.model.PdfBoxColor create(float[] rgb) throws java.io.IOException {
    java.lang.String rgbStr = (rgb != null) ? java.util.Arrays.toString(rgb) : null;
    if (!(parser.pdfbox.model.PdfBoxColor.colorMap.containsKey(rgbStr))) {
        parser.pdfbox.model.PdfBoxColor.colorMap.put(rgbStr, new parser.pdfbox.model.PdfBoxColor(rgb));
    }
    return parser.pdfbox.model.PdfBoxColor.colorMap.get(rgbStr);
}