public java.lang.String getText() {
    java.lang.String text;
    try {
        org.apache.poi.hssf.extractor.EventBasedExcelExtractor.TextListener tl = triggerExtraction();
        text = tl._text.toString();
        if (!(text.endsWith("\n"))) {
            text = text + "\n";
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    return text;
}