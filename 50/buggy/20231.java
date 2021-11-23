private static org.apache.axiom.om.OMElement buildInitialOMElement() {
    org.apache.axiom.om.OMElement initialOMElement;
    initialOMElement = org.wso2.carbon.governance.registry.extensions.aspects.utils.StatWriter.factory.createOMElement(new javax.xml.namespace.QName("lifecycleHistory"));
    return initialOMElement;
}