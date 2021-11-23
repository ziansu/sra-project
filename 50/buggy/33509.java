public java.lang.String renderTemplate(java.lang.String item) throws java.io.IOException {
    com.github.jknack.handlebars.Template tmpl = handlerBarRenderer.getNext().compileInline(item);
    java.lang.String alertSubjectResult = tmpl.apply(getDataObject());
    return alertSubjectResult;
}