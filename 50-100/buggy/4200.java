private java.lang.String getVersionName(final com.amazonaws.services.cloudtrail.processinglibrary.model.CloudTrailEvent event, final java.lang.String instance) {
    java.lang.String instanceId = getInstanceId(instance);
    java.util.Map userData = userDataProvider.getUserData(getAccountId(event), getRegion(event), instanceId);
    return userData.get("application_version").toString();
}