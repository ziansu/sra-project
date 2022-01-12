public static org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType valueOfWithDefault(java.lang.String type) {
    try {
        return org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType.valueOf(type.toUpperCase());
    } catch (java.lang.IllegalArgumentException e) {
        return org.cloudfoundry.client.lib.domain.CloudServiceUsageEvent.ServiceInstanceType.UNKNOWN;
    }
}