public static org.joda.time.DateTime getEventTime(com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEvent event) {
    event = com.google.common.base.Preconditions.checkNotNull(event, org.zalando.stups.fullstop.events.CloudtrailEventSupport.CLOUD_TRAIL_EVENT_SHOULD_NEVER_BE_NULL);
    return new org.joda.time.DateTime(event.getEventData().getEventTime());
}