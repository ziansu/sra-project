private javax.xml.parsers.DocumentBuilder getSecuredDocumentBuilder(boolean setIgnoreComments) throws javax.xml.parsers.ParserConfigurationException {
    javax.xml.parsers.DocumentBuilderFactory documentBuilderFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
    documentBuilderFactory.setIgnoringComments(setIgnoreComments);
    documentBuilderFactory.setNamespaceAware(true);
    documentBuilderFactory.setExpandEntityReferences(false);
    documentBuilderFactory.setFeature(javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING, true);
    org.apache.xerces.util.SecurityManager securityManager = new java.lang.SecurityManager();
    securityManager.setEntityExpansionLimit(org.wso2.carbon.identity.entitlement.common.InMemoryPersistenceManager.ENTITY_EXPANSION_LIMIT);
    documentBuilderFactory.setAttribute(org.wso2.carbon.identity.entitlement.common.InMemoryPersistenceManager.SECURITY_MANAGER_PROPERTY, securityManager);
    javax.xml.parsers.DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    documentBuilder.setEntityResolver(new org.wso2.carbon.identity.entitlement.common.util.CarbonEntityResolver());
    return documentBuilder;
}