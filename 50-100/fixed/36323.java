public static void registerShowDialog(java.lang.String title, java.lang.String type) {
    if (net.demilich.metastone.analytics.MetastoneAnalytics.DISABLED)
        return ;
    
    if (net.demilich.metastone.BuildConfig.DEV_BUILD)
        net.demilich.metastone.analytics.MetastoneAnalytics.logger.info(((("registerShowDialog: " + title) + ", type: ") + type));
    
    net.demilich.metastone.analytics.MetastoneAnalytics.INSTANCE.analyticsTracker.type(GoogleAnalytics.HitType.screenview).applicationVersion(BuildConfig.VERSION).category("dialog").action("show").screenName(title).label(type).build().send();
}