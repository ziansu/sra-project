public synchronized org.ops4j.pax.web.service.spi.model.ServletModel removeServlet(final javax.servlet.Servlet servlet) {
    final org.ops4j.pax.web.service.spi.model.ServletModel model = findServletModel(servlet);
    if (model == null) {
        throw new java.lang.IllegalArgumentException((("Servlet [" + servlet) + " is not currently registered in any context"));
    }
    servletModels.remove(servlet);
    return model;
}