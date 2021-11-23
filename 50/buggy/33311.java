public boolean isEligibleToCheckVersionOnPlayStore() {
    java.util.Date lastCheckedOn = com.mk.familyweighttracker.Framework.PreferenceHelper.getDate(Constants.SharedPreference.AppMarketLastUpdateCheckedOn, new java.util.Date());
    long lastCheckedBeforeDays = com.mk.familyweighttracker.Framework.Utility.calculateDateDiff(lastCheckedOn);
    if (lastCheckedBeforeDays < (com.mk.familyweighttracker.Framework.Constants.CHECK_MARKET_APP_UPDATE_AFTER_DAYS))
        return false;
    
    return true;
}