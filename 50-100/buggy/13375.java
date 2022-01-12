private AnalyticsDataConfiguration.Mode getOperationMode() {
    if ((mode) == null) {
        synchronized(this) {
            if ((mode) == null) {
                org.wso2.carbon.analytics.api.internal.AnalyticsDataConfiguration.Mode mode = analyticsDataConfiguration.getOperationMode();
                if (mode == (AnalyticsDataConfiguration.Mode.AUTO)) {
                    if ((org.wso2.carbon.analytics.api.internal.ServiceHolder.getAnalyticsDataService()) != null) {
                        this.mode = AnalyticsDataConfiguration.Mode.LOCAL;
                    }
                    this.mode = AnalyticsDataConfiguration.Mode.REMOTE;
                }else {
                    this.mode = mode;
                }
            }
        }
    }
    return mode;
}