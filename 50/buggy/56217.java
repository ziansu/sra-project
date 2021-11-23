public static org.joda.time.DateTime getEventTime(com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEvent event) {
    event = com.google.common.base.Preconditions.checkNotNull(event, org.zalando.stups.fullstop.events.CloudtrailEventSupport.CLOUD_TRAIL_EVENT_SHOULD_NEVER_BE_NULL);
    com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEventData eventData = org.zalando.stups.fullstop.events.CloudtrailEventSupport.getEventData(event);
    java.lang.String responseElements = eventData.getResponseElements();
    return com.jayway.jsonpath.JsonPath.read(responseElements, org.zalando.stups.fullstop.events.CloudtrailEventSupport.EVENT_TIME);
}