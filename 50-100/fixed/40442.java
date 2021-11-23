@java.lang.Override
public void render(ratpack.handling.Context ctx, ratpack.thymeleaf3.Template template) {
    java.lang.String contentType = template.getContentType();
    contentType = (contentType == null) ? "text/html" : contentType;
    try {
        ctx.getResponse().send(contentType, thymeleaf.process(template.getName(), template.getModel()));
    } catch (java.lang.Exception e) {
        ctx.error(e);
    }
}