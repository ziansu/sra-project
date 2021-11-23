@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((redit.com.redditshow.util.PreferenceUtil.getAutoScroll(getApplicationContext())) && (android.text.TextUtils.equals(subredditsStr, redit.com.redditshow.util.PreferenceUtil.getSubreddit(getApplicationContext())))) {
        try {
            handler.postDelayed(r, 5000);
        } catch (java.lang.Exception e) {
        }
    }
    if (!(android.text.TextUtils.equals(subredditsStr, redit.com.redditshow.util.PreferenceUtil.getSubreddit(getApplicationContext())))) {
        fetchData();
    }
}