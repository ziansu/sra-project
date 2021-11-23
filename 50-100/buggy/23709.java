@java.lang.Override
public boolean supports(final com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEvent event) {
    com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEventData cloudTrailEventData = event.getEventData();
    java.lang.String eventSource = cloudTrailEventData.getEventSource();
    java.lang.String eventName = cloudTrailEventData.getEventName();
    return (eventSource.equals(org.zalando.stups.fullstop.plugin.SaveSecurityGroupsPlugin.EC2_SOURCE_EVENTS)) && (eventName.equals(org.zalando.stups.fullstop.plugin.SaveSecurityGroupsPlugin.EVENT_NAME));
}