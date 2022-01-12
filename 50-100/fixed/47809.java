private org.eclipse.californium.core.coap.CoAP.ResponseCode handleGETCoRE(org.eclipse.californium.core.qos.QoSObserveRelation clientrelation) {
    org.eclipse.californium.reverseproxy.resources.ReverseProxyResource.LOGGER.log(java.util.logging.Level.FINER, (("handleGETCoRE(" + clientrelation) + ")"));
    org.eclipse.californium.reverseproxy.QoSParameters pr = new org.eclipse.californium.reverseproxy.QoSParameters();
    pr.setPmax(clientrelation.getPmax());
    pr.setPmin(clientrelation.getPmin());
    pr.setAllowed(clientrelation.isEstablished());
    if ((pr.isAllowed()) || (scheduleNewRequest(clientrelation))) {
        return org.eclipse.californium.core.coap.CoAP.ResponseCode.CONTENT;
    }else {
        return org.eclipse.californium.core.coap.CoAP.ResponseCode.NOT_ACCEPTABLE;
    }
}