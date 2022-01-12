@java.lang.Override
public void selected(final com.gilvitzi.uavlogbookpro.util.StringValuePair selectedPlatform) {
    if (selectedPlatform != null) {
        fullScreenAd.startActionAfterRandomChanceAd(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                openSessionsPerPlatformReport(selectedPlatform);
            }
        }, com.gilvitzi.uavlogbookpro.activity.ActivityReports.CHANCE_OF_FULL_SCREEN_AD);
    }
}