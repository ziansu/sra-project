private void loadPodcast() {
    if (isLoading()) {
        android.util.Log.i(com.mamewo.podplayer0.TAG, "Already loading");
        return ;
    }
    setProgressBarIndeterminateVisibility(true);
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    android.content.res.Resources res = getResources();
    int limit = java.lang.Integer.valueOf(pref.getString("episode_limit", res.getString(R.string.default_episode_limit)));
    com.mamewo.podplayer0.PodplayerActivity.GetPodcastTask task = new com.mamewo.podplayer0.PodplayerActivity.GetPodcastTask(limit);
    startLoading(task);
}