private void bumpPromoAnaylticsAndShowPromoDialogIfNecessary() {
    if ((mIsUpdatingStats) || (mThereWasAnErrorLoadingStats)) {
        return ;
    }
    org.wordpress.android.ui.prefs.AppPrefs.bumpAnalyticsForStatsWidgetPromo();
    java.lang.String prevWidgetKeysString = org.wordpress.android.ui.prefs.AppPrefs.getStatsWidgetsKeys();
    if (org.apache.commons.lang.StringUtils.isEmpty(prevWidgetKeysString)) {
        int counter = org.wordpress.android.ui.prefs.AppPrefs.getAnalyticsForStatsWidgetPromo();
        if (((counter == 3) || (counter == 1000)) || (counter == 10000)) {
            android.app.DialogFragment newFragment = org.wordpress.android.ui.stats.StatsActivity.StatsWidgetPromoDialogFragment.newInstance();
            newFragment.show(getFragmentManager(), "promote_widget_dialog");
        }
    }
}