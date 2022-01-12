@java.lang.Override
public io.vertx.ext.web.templ.ThymeleafTemplateEngine setMode(org.thymeleaf.templatemode.TemplateMode mode) {
    templateResolver.setTemplateMode(mode);
    return this;
}