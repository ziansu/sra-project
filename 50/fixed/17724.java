private boolean processingSuppressed(org.carrot2.util.xsltfilter.HttpServletRequest origRequest2) {
    return ((origRequest.getAttribute(XSLTFilterConstants.NO_XSLT_PROCESSING)) != null) || ((origRequest.getParameter(XSLTFilterConstants.NO_XSLT_PROCESSING)) != null);
}