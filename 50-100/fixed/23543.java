public static boolean isIntentChromeOrFirstParty(android.content.Intent intent, android.content.Context context) {
    if (intent == null)
        return false;
    
    android.app.PendingIntent token = org.chromium.chrome.browser.IntentHandler.fetchAuthenticationTokenFromIntent(intent);
    if (token == null)
        return false;
    
    if (org.chromium.chrome.browser.IntentHandler.isChromeToken(token, context)) {
        return true;
    }
    if (org.chromium.chrome.browser.externalauth.ExternalAuthUtils.getInstance().isGoogleSigned(context, org.chromium.base.ApiCompatibilityUtils.getCreatorPackage(token))) {
        return true;
    }
    return false;
}