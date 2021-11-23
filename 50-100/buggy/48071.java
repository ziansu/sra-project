private ivisObject.IvisObject createIvisObject(org.dom4j.Node node, java.util.List<java.lang.String> subquerySelectors, java.lang.String elementName) {
    java.util.List<ivisObject.AttributeValuePair> attributeValuePairs = new java.util.ArrayList<ivisObject.AttributeValuePair>(subquerySelectors.size());
    for (java.lang.String subquerySelector : subquerySelectors) {
        java.lang.String name = getName(subquerySelector);
        java.lang.Object value = node.selectSingleNode(subquerySelector).getText();
        attributeValuePairs.add(new ivisObject.AttributeValuePair(elementName, value));
    }
    ivisObject.IvisObject newIvisObject = new ivisObject.IvisObject(elementName, attributeValuePairs);
    return newIvisObject;
}