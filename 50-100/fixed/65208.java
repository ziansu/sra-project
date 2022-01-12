@java.lang.Override
public void onPageFinished(java.lang.String url) {
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.loadComposer(mWebView);
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.hideMenuBar(mWebView);
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateCurrentTab(mWebView);
    me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateNotificationsService(mWebView);
    if (mPreferences.getBoolean(SettingsActivity.KEY_PREF_MESSAGING, false)) {
        me.jakelane.wrapperforfacebook.JavaScriptHelpers.updateMessagesService(mWebView);
    }
    mActivity.checkLoggedInState();
}