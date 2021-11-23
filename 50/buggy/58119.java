private java.lang.String getVersionName(com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEvent event, java.lang.String instance) {
    java.lang.String instanceId = org.zalando.stups.fullstop.events.CloudtrailEventSupport.getSingleInstance(instance);
    java.util.Map userData = userDataProvider.getUserData(event, instanceId);
    return userData.get("application_version").toString();
}