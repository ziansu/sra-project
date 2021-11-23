private void handleRequireOpenmrsVersion(org.openmrs.addonindex.domain.AddOnVersion addOnVersion, javax.xml.xpath.XPath xpath, org.w3c.dom.Document config) throws javax.xml.xpath.XPathExpressionException {
    java.lang.Object str = xpath.evaluate("/module/require_version/text()", config, javax.xml.xpath.XPathConstants.STRING);
    if (org.springframework.util.StringUtils.hasText(((java.lang.String) (str)))) {
        addOnVersion.setRequireOpenmrsVersion(((java.lang.String) (str)).trim());
    }
}