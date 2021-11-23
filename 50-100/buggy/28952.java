public static com.webtrekk.webtrekksdk.Modules.Campaign start(android.content.Context context, java.lang.String trackID, boolean isFirstStart, boolean isAutoTrackAdvID, java.lang.Runnable stopNotification) {
    if ((trackID == null) || (trackID.isEmpty())) {
        com.webtrekk.webtrekksdk.Utils.WebtrekkLogging.log("Track ID is received to Campain server is null. Campain can't be tracked");
        return null;
    }
    com.webtrekk.webtrekksdk.Modules.Campaign service = new com.webtrekk.webtrekksdk.Modules.Campaign(context, trackID, isFirstStart, isAutoTrackAdvID, stopNotification);
    service.start();
    return service;
}