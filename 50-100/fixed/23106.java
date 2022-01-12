@java.lang.Override
public org.craftercms.studio.api.v1.dal.ActivityFeed getDeletedActivity(java.lang.String site, java.lang.String path) {
    java.util.HashMap<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    params.put("contentId", path);
    params.put("siteNetwork", site);
    java.lang.String activityType = ActivityType.DELETED.toString();
    params.put("activityType", activityType);
    return activityFeedMapper.getDeletedActivity(params);
}