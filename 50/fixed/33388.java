public static com.opsgenie.integration.jenkins.AlertPriority fromDisplayName(java.lang.String value) {
    for (com.opsgenie.integration.jenkins.AlertPriority priority : com.opsgenie.integration.jenkins.AlertPriority.values()) {
        if (priority.getValue().equals(value)) {
            return priority;
        }
    }
    return com.opsgenie.integration.jenkins.AlertPriority.P3;
}