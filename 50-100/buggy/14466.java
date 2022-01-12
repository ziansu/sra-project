public static void registerDismissDialog(java.lang.String title, java.lang.String type, int dialogResult) {
    if (net.demilich.metastone.analytics.MetastoneAnalytics.DISABLED)
        return ;
    
    if (net.demilich.metastone.BuildConfig.DEV_BUILD)
        net.demilich.metastone.analytics.MetastoneAnalytics.logger.info(((((("registerShowDialog: " + title) + ", type: ") + type) + ", result: ") + dialogResult));
    
    net.demilich.metastone.analytics.MetastoneAnalytics.INSTANCE.analyticsTracker.type(GoogleAnalytics.HitType.screenview).applicationVersion(BuildConfig.VERSION).category("dialog").action("dismiss").screenName(title).label(type).value(dialogResult).build().send(false);
}