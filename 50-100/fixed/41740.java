public static freemarker.template.Configuration getConfiguration(java.lang.String path) {
    freemarker.template.Configuration cfg = new freemarker.template.Configuration();
    cfg.setDefaultEncoding("UTF-8");
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    java.io.File templateFiles = new java.io.File(path);
    try {
        cfg.setDirectoryForTemplateLoading(templateFiles);
    } catch (java.io.IOException e) {
        throw new com.qlp.core.exception.MyException(e);
    }
    return cfg;
}