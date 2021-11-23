protected boolean handleGatewayProtocol(final org.universAAL.ri.gateway.protocol.Message msg) {
    try {
        org.universAAL.ri.gateway.protocol.Message upper = null;
        if ((msg instanceof org.universAAL.ri.gateway.protocol.LinkMessage) == true) {
            org.universAAL.ri.gateway.communicator.service.impl.AbstractLinkHandler.log.info((("The handling of Message " + msg) + " is not expected to be performed by the Upper Layer of Gateway because it is LinkMessage thus the message is SKIPPED"));
            return false;
        }
        communicator.handleMessage(upper);
    } catch (final java.lang.Exception ex) {
        final java.lang.String txt = "Exception while handling Gateway message " + msg;
        org.universAAL.ri.gateway.communicator.service.impl.AbstractLinkHandler.log.info(txt);
        org.universAAL.ri.gateway.communicator.service.impl.AbstractLinkHandler.log.debug(txt, ex);
        return false;
    }
    return true;
}