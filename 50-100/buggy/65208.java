@java.lang.Override
public void onPageFinished(java.lang.String url) {
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.loadComposer(mWebView);
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.hideMenuBar(mWebView);
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateCurrentTab(mWebView);
    int update_interval = java.lang.Integer.parseInt(mPreferences.getString(SettingsActivity.KEY_PREF_UPDATE_INTERVAL, "45000"));
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateNotificationsService(mWebView, update_interval);
    if (mPreferences.getBoolean(SettingsActivity.KEY_PREF_MESSAGING, false)) {
        me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateMessagesService(mWebView, update_interval);
    }
    mActivity.checkLoggedInState();
}