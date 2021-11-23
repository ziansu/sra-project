public static void registerShowScreen(java.lang.String screenName) {
    if (net.demilich.metastone.analytics.MetastoneAnalytics.DISABLED)
        return ;
    
    if (net.demilich.metastone.BuildConfig.DEV_BUILD)
        net.demilich.metastone.analytics.MetastoneAnalytics.logger.info(("registerShowScreen: " + screenName));
    
    net.demilich.metastone.analytics.MetastoneAnalytics.INSTANCE.analyticsTracker.type(GoogleAnalytics.HitType.screenview).applicationVersion(BuildConfig.VERSION).category("navigation").action("show").screenName(screenName).build().send(false);
}