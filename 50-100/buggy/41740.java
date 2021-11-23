public static freemarker.template.Configuration getConfiguration(java.lang.String path) {
    if ((com.qlp.core.util.FreeMarkerUtil.cfg) == null) {
        synchronized(freemarker.template.Configuration.class) {
            if ((com.qlp.core.util.FreeMarkerUtil.cfg) == null) {
                freemarker.template.Configuration cfg = new freemarker.template.Configuration();
                cfg.setDefaultEncoding("UTF-8");
                cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
                java.io.File templateFiles = new java.io.File(path);
                try {
                    cfg.setDirectoryForTemplateLoading(templateFiles);
                } catch (java.io.IOException e) {
                    throw new com.qlp.core.exception.MyException(e);
                }
            }
        }
    }
    return com.qlp.core.util.FreeMarkerUtil.cfg;
}