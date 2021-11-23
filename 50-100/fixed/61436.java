public void init(org.carrot2.util.xsltfilter.FilterConfig filterConfig) throws org.carrot2.util.xsltfilter.ServletException {
    if (filterConfig == null) {
        throw new java.lang.IllegalArgumentException("FilterConfig must not be null.");
    }
    this.context = filterConfig.getServletContext();
    final boolean templateCaching = getBooleanInit(filterConfig, org.carrot2.util.xsltfilter.XSLTFilter.PARAM_TEMPLATE_CACHING, true);
    try {
        pool = new org.carrot2.util.xslt.TemplatesPool(templateCaching);
    } catch (java.lang.Exception e) {
        final java.lang.String message = "Could not initialize XSLT transformers pool.";
        org.carrot2.util.xsltfilter.XSLTFilter.logger.error(message, e);
        throw new org.carrot2.util.xsltfilter.ServletException(message, e);
    }
}