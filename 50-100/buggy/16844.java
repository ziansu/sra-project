@java.lang.Override
protected boolean shouldIntercept(org.springframework.ws.WebServiceMessage request, java.lang.Object endpoint) {
    try {
        javax.xml.namespace.QName payloadRootName = org.springframework.ws.server.endpoint.support.PayloadRootUtils.getPayloadRootQName(request.getPayloadSource(), transformerHelper);
        if (!(namespaceUri.equals(payloadRootName.getNamespaceURI()))) {
            return false;
        }
        return (!(org.springframework.util.StringUtils.hasLength(localPart))) || (localPart.equals(payloadRootName.getLocalPart()));
    } catch (javax.xml.transform.TransformerException e) {
        return false;
    }
}