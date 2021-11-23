public org.apache.axis2.jaxws.message.Block getHeaderBlock(java.lang.String namespace, java.lang.String localPart, java.lang.Object context, org.apache.axis2.jaxws.message.factory.BlockFactory blockFactory) throws javax.xml.ws.WebServiceException {
    org.apache.axiom.om.OMElement om = org.apache.axis2.jaxws.message.impl.XMLSpineImpl._getChildOMElement(root.getHeader(), namespace, localPart);
    if (om == null) {
        return null;
    }
    return this._getBlockFromOMElement(om, context, blockFactory, false);
}