public static java.lang.String readOMElementValue(org.apache.axiom.om.OMElement parentElement, java.lang.String elementName) {
    org.apache.axiom.om.OMElement element = parentElement.getFirstChildWithName(new javax.xml.namespace.QName(elementName));
    java.lang.String elementValue = null;
    if (!(element.getText().trim().isEmpty())) {
        elementValue = element.getText();
    }
    return elementValue;
}