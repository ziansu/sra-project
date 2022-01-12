protected java.lang.Object evalXpathExpr(java.lang.String expr, javax.xml.namespace.QName rType) {
    try {
        javax.xml.xpath.XPathFactory fac = javax.xml.xpath.XPathFactory.newInstance();
        javax.xml.xpath.XPath xpath = fac.newXPath();
        javax.xml.xpath.XPathExpression pathexp;
        pathexp = xpath.compile(((("/" + (app.tascact.manual.XMLResources.BOOK_TAG)) + "/") + (app.tascact.manual.XMLResources.PAGE_TAG)));
        return pathexp.evaluate(resources, javax.xml.xpath.XPathConstants.NODESET);
    } catch (javax.xml.xpath.XPathExpressionException e) {
        e.printStackTrace();
        android.util.Log.e("XML", e.getMessage());
        return null;
    }
}