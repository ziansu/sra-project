private void parseHerbExtras(android.content.Intent intent, android.content.Context context) {
    java.lang.String herbFlavor = org.chromium.chrome.browser.util.FeatureUtilities.getHerbFlavor();
    if ((android.text.TextUtils.isEmpty(herbFlavor)) || (android.text.TextUtils.equals(ChromeSwitches.HERB_FLAVOR_DISABLED, herbFlavor))) {
        return ;
    }
    if (!(org.chromium.chrome.browser.IntentHandler.isIntentChromeOrFirstParty(intent, context)))
        return ;
    
    mIsOpenedByChrome = org.chromium.chrome.browser.util.IntentUtils.safeGetBooleanExtra(intent, org.chromium.chrome.browser.customtabs.CustomTabIntentDataProvider.EXTRA_IS_OPENED_BY_CHROME, false);
}