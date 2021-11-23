private void handleResponse(int statusCode, java.lang.String reply) throws java.io.IOException {
    com.splunk.cloudfwd.LifecycleEvent.Type type;
    switch (statusCode) {
        case 503 :
            warn(reply, statusCode);
            type = com.splunk.cloudfwd.LifecycleEvent.Type.PREFLIGHT_BUSY;
        case 504 :
            warn(reply, statusCode);
            type = LifecycleEvent.Type.PREFLIGHT_GATEWAY_TIMEOUT;
        case 200 :
            LOG.info("HEC preflight check is good on {}", getChannel());
            type = com.splunk.cloudfwd.LifecycleEvent.Type.PREFLIGHT_OK;
            break;
        default :
            type = error(reply, statusCode);
    }
    notify(type, statusCode, reply);
}