private void parseFirstPages() throws com.cybozu.labs.langdetect.LangDetectException, java.io.IOException, modules.InvalidPDF {
    java.lang.String parsedText = pdfConverter.parseNPages(modules.PDFExtractor.startFirstPage, modules.PDFExtractor.endFirstPage);
    models.BasicText basicText = new models.BasicText(parsedText);
    setTitlePage(basicText.getText());
    java.lang.String[] tokens = Util.NLPUtil.getTokenPM(parsedText, basicText.getLanguage());
    getKeywordsPDF(tokens);
    optimizeTitlePageSize();
}