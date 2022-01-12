public org.w3c.dom.NodeList getNodeListByXpath(final org.w3c.dom.Node parentNode, final java.lang.String xPath) {
    org.w3c.dom.NodeList nodeList = null;
    try {
        final javax.xml.xpath.XPathExpression compiledXpath = xpathEvaluator.compile(xPath);
        synchronized(parentNode) {
            nodeList = ((org.w3c.dom.NodeList) (compiledXpath.evaluate(parentNode, javax.xml.xpath.XPathConstants.NODESET)));
        }
    } catch (final javax.xml.xpath.XPathExpressionException e) {
        if (org.bonitasoft.forms.server.accessor.impl.util.XPathUtil.LOGGER.isLoggable(java.util.logging.Level.WARNING)) {
            org.bonitasoft.forms.server.accessor.impl.util.XPathUtil.LOGGER.log(java.util.logging.Level.WARNING, "Error in Xpath expression", e);
        }
    }
    return nodeList;
}