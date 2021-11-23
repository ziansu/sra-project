@java.lang.Override
public synchronized void consumeReward(com.tapstream.sdk.wordofmouth.Reward reward) {
    java.lang.String key = java.lang.Integer.toString(reward.getOfferId());
    android.content.SharedPreferences prefs = app.getApplicationContext().getSharedPreferences(com.tapstream.sdk.AndroidPlatform.WOM_REWARDS_KEY, Context.MODE_PRIVATE);
    prefs.edit().putInt(key, ((prefs.getInt(key, 0)) + 1)).apply();
}