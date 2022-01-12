public void addAverageResourceInterests(java.lang.String groupId, se.kth.honeytap.scaling.monitoring.RuleSupport.ResourceType resourceType, float lowerPercentile, float upperPercentile, int timeDuration) throws se.kth.honeytap.scaling.exceptions.HoneyTapException {
    se.kth.honeytap.scaling.monitoring.InterestedEvent event = new se.kth.honeytap.scaling.monitoring.InterestedEvent(resourceType.name().concat(Constants.SEPARATOR).concat(Constants.AVERAGE).concat(Constants.SEPARATOR).concat(java.lang.String.valueOf(lowerPercentile).concat("-").concat(java.lang.String.valueOf(upperPercentile))));
    monitoringHandler.addInterestedEvent(groupId, new se.kth.honeytap.scaling.monitoring.InterestedEvent[]{ event }, timeDuration);
}