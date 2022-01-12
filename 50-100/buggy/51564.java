protected org.apache.wicket.protocol.https.Scheme getDesiredSchemeFor(org.apache.wicket.request.IRequestHandler handler) {
    if (handler instanceof org.brixcms.web.nodepage.BrixNodePageRequestHandler) {
        org.brixcms.jcr.wrapper.BrixNode.Protocol protocol = ((org.brixcms.web.nodepage.BrixNodePageRequestHandler) (handler)).getPage().getPageNode().getRequiredProtocol();
        switch (protocol) {
            case HTTP :
                return org.apache.wicket.protocol.https.Scheme.HTTP;
            case HTTPS :
                return org.apache.wicket.protocol.https.Scheme.HTTPS;
            case PRESERVE_CURRENT :
                return org.apache.wicket.protocol.https.Scheme.HTTP;
        }
    }
    return org.apache.wicket.protocol.https.Scheme.ANY;
}