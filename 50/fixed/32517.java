public static org.thymeleaf.TemplateEngine initializeTemplateEngine() {
    return org.thymoljs.thymol.test.webapp.ThymolTestApplication.initializeTemplateEngine(org.thymoljs.thymol.test.webapp.ThymolTestApplication.APP_PREFIX, ThymolTestFilter.APP_SUFFIX, null, null);
}