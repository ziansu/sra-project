public static ratpack.thymeleaf3.Template thymeleafTemplate(java.util.Map<java.lang.String, ?> model, java.lang.String name, java.lang.String contentType) {
    javax.servlet.http.HttpServletRequest request = new ratpack.thymeleaf3.internal.ThymeleafHttpServletRequestAdapter();
    javax.servlet.http.HttpServletResponse response = new ratpack.thymeleaf3.internal.ThymeleafHttpServletResponseAdapter();
    javax.servlet.ServletContext servletContext = new ratpack.thymeleaf3.internal.ThymeleafServletContextAdapter();
    org.thymeleaf.context.WebContext context = new org.thymeleaf.context.WebContext(request, response, servletContext);
    if (model != null) {
        context.setVariables(((java.util.Map<java.lang.String, java.lang.Object>) (model)));
    }
    return new ratpack.thymeleaf3.Template(name, context, contentType);
}