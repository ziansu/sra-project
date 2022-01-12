@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    java.util.HashMap<java.lang.String, java.lang.String> errorProperties = new java.util.HashMap<>();
    errorProperties.put(org.wordpress.android.ui.accounts.login.MagicLinkRequestFragment.ERROR_KEY, error.getMessage());
    org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.LOGIN_MAGIC_LINK_FAILED, errorProperties);
    android.support.design.widget.Snackbar.make(getView(), R.string.magic_link_unavailable_error_message, Snackbar.LENGTH_SHORT);
    if ((mListener) != null) {
        mListener.onEnterPasswordRequested();
    }
}