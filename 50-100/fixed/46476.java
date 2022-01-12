private void verifyHealthCheckSupport() {
    if ((hasHealthCheckSupport) == null) {
        java.util.List<java.lang.String> jvbFeatures = capsOpSet.getFeatures(bridgeJid);
        if (jvbFeatures != null) {
            hasHealthCheckSupport = org.jitsi.jicofo.DiscoveryUtil.checkFeatureSupport(org.jitsi.jicofo.JvbDoctor.HEALTH_CHECK_FEATURES, jvbFeatures);
            if (!(hasHealthCheckSupport)) {
                org.jitsi.jicofo.JvbDoctor.logger.warn(((bridgeJid) + " does not support health checks!"));
            }
        }else {
            org.jitsi.jicofo.JvbDoctor.logger.warn(("Failed to check for health check support on " + (bridgeJid)));
        }
    }
}