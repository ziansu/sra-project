private java.lang.String string(freemarker.template.TemplateModel key) throws freemarker.template.TemplateModelException {
    if (key == null)
        return null;
    
    return ((freemarker.template.TemplateScalarModel) (key)).getAsString();
}