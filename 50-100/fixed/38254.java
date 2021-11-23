private void handleEndTag(java.lang.String tag) throws org.xml.sax.SAXException {
    for (com.github.kubatatami.richedittext.styles.base.SpanController<?> spanController : mSpanControllers) {
        java.lang.Class<?> spanClass = spanController.spanFromEndTag(tag);
        if (spanClass != null) {
            com.github.kubatatami.richedittext.modules.HtmlImportModule.HtmlToSpannedConverter.end(mSpannableStringBuilder, spanClass, spanController);
        }
    }
}