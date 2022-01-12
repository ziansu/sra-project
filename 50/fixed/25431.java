@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    mProgressDialog.cancel();
    org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.LOGIN_MAGIC_LINK_REQUESTED);
    if ((mListener) != null) {
        mListener.onMagicLinkSent();
    }
}