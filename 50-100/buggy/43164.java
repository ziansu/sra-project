protected void logEventWithDuration(org.json.JSONObject eventInfo) {
    org.cocos2dx.plugin.AnalyticsUmeng.LogD(("logEventWithDuration invoked! event : " + (eventInfo.toString())));
    if (!(isValid()))
        return ;
    
    try {
        java.lang.String eventId = eventInfo.getString("Param1");
        int duration = eventInfo.getInt("Param2");
        com.umeng.analytics.MobclickAgent.onEventDuration(mContext, eventId, duration);
    } catch (java.lang.Exception e) {
        org.cocos2dx.plugin.AnalyticsUmeng.LogE("Exception in logEventWithDuration", e);
    }
}