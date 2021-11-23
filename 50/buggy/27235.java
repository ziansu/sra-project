public static org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType valueOfWithDefault(java.lang.String type) {
    try {
        return org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType.valueOf(type);
    } catch (java.lang.IllegalArgumentException e) {
        return org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType.UNKNOWN;
    }
}