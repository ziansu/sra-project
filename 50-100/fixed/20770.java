public synchronized org.ops4j.pax.web.service.spi.model.ServletModel removeServlet(final java.lang.String servletName) {
    org.ops4j.pax.web.service.spi.model.ServletModel model = findServletModel(servletName);
    if (model == null) {
        throw new java.lang.IllegalArgumentException((("Servlet with name [" + servletName) + "] is currently not registered in any context"));
    }
    servletModels.remove(model);
    return model;
}