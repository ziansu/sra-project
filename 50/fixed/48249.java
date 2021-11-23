private java.lang.String getEventType(java.lang.String eventType) {
    if ((eventType != null) && (eventType.startsWith(com.appdynamics.extensions.pagerduty.api.AlertBuilder.POLICY_CLOSE))) {
        return com.appdynamics.extensions.pagerduty.api.AlertBuilder.RESOLVE;
    }
    return com.appdynamics.extensions.pagerduty.api.AlertBuilder.TRIGGER;
}