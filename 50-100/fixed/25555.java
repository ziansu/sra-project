protected java.lang.Object evalXpathExpr(java.lang.String expr, javax.xml.namespace.QName rType) {
    try {
        javax.xml.xpath.XPathFactory fac = javax.xml.xpath.XPathFactory.newInstance();
        javax.xml.xpath.XPath xpath = fac.newXPath();
        javax.xml.xpath.XPathExpression pathexp = xpath.compile(expr);
        return pathexp.evaluate(resources, rType);
    } catch (javax.xml.xpath.XPathExpressionException e) {
        e.printStackTrace();
        android.util.Log.e("XML", e.getMessage());
        return null;
    }
}