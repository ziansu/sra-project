protected static boolean isLinepitchLargerThanExpected(pdfact.models.PdfDocument pdf, pdfact.models.PdfTextLine prevLine, pdfact.models.PdfTextLine line) {
    if (pdf == null) {
        return false;
    }
    pdfact.models.PdfCharacterStatistic characterStats = line.getCharacterStatistic();
    pdfact.models.PdfTextLineStatistic textLineStats = pdf.getTextLineStatistic();
    pdfact.models.PdfFontFace fontFace = characterStats.getMostCommonFontFace();
    float expectedLinePitch = textLineStats.getMostCommonLinePitch(fontFace);
    float actualLinePitch = pdfact.utils.textlines.PdfTextLineUtils.computeLinePitch(prevLine, line);
    return (actualLinePitch - expectedLinePitch) > 1;
}