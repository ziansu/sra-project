private static freemarker.template.Template getTemplate(com.orctom.laputa.service.model.RequestMapping mapping) {
    try {
        java.lang.String templatePath = (getTemplatePath(mapping)) + (com.orctom.laputa.translator.FreemarkerResponseTranslator.TEMPLATE_SUFFIX);
        com.orctom.laputa.translator.FreemarkerResponseTranslator.LOGGER.debug("Template Path: {} for url: {}", templatePath, mapping.getUriPattern());
        return com.orctom.laputa.translator.FreemarkerResponseTranslator.cfg.getTemplate(templatePath);
    } catch (java.io.IOException e) {
        throw new com.orctom.laputa.exception.IllegalConfigException(e.getMessage());
    }
}