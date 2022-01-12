@java.lang.Override
protected void onPreExecute() {
    mHasToNotify = false;
    mAccessToken = com.abel.putovits.gravelapp.utils.FacebookAccessToken.getInstance();
    android.content.SharedPreferences preferences = mContext.getSharedPreferences(com.abel.putovits.gravelapp.receivers.CheckForNewEventsReceiver.PREFERENCES_NAME, Context.MODE_PRIVATE);
    mSimpleDateFormat = new java.text.SimpleDateFormat("yyyy-mm-dd");
    try {
        mLastEventInMilliseconds = mSimpleDateFormat.parse(preferences.getString(com.abel.putovits.gravelapp.receivers.CheckForNewEventsReceiver.LAST_EVENT_PREF_NAME, mSimpleDateFormat.format(new java.util.Date())));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}