private nl.hu.tho6.utils.stringtemplate.StringTemplate getTemplateForLanguage(java.lang.String language) {
    return new nl.hu.tho6.utils.stringtemplate.StringTemplate(translator.getTranslationForElement("Template", language));
}