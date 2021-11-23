public void render(java.io.Writer out) throws org.grails.web.converters.exceptions.ConverterException {
    prepareRender(out);
    value(target);
    finalizeRender(out);
}