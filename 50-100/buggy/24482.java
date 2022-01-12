public void updateRTT() {
    evaluateRtt();
    org.eclipse.californium.reverseproxy.resources.ReverseProxyResource.LOGGER.log(java.util.logging.Level.FINER, "updateRTO()");
    org.eclipse.californium.reverseproxy.resources.ReverseProxyResource.LOGGER.info(((("Last Valid RTT= " + (java.lang.String.valueOf(lastValidRtt))) + " - currentRTO= ") + (java.lang.String.valueOf(rtt))));
    if (((rtt) - (org.eclipse.californium.reverseproxy.resources.ReverseProxyResource.THRESHOLD)) > (lastValidRtt)) {
        scheduleFeasibles();
    }
}