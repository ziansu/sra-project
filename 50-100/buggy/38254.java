private void handleEndTag(java.lang.String tag) throws org.xml.sax.SAXException {
    for (com.github.kubatatami.richedittext.styles.base.SpanController<?> spanController : mSpanControllers) {
        java.lang.Class<?> spanClass = spanController.spanFromEndTag(tag);
        if (spanClass != null) {
            if (com.github.kubatatami.richedittext.modules.HtmlImportModule.HtmlToSpannedConverter.end(mSpannableStringBuilder, spanClass, spanController)) {
                (com.github.kubatatami.richedittext.modules.HtmlImportModule.tagCounter)--;
                if ((com.github.kubatatami.richedittext.modules.HtmlImportModule.tagBaseCounter) == null) {
                    throw new org.xml.sax.SAXException("End tag before start any");
                }
                com.github.kubatatami.richedittext.modules.HtmlImportModule.endingMode = (com.github.kubatatami.richedittext.modules.HtmlImportModule.tagCounter) > (com.github.kubatatami.richedittext.modules.HtmlImportModule.tagBaseCounter);
                return ;
            }
        }
    }
}