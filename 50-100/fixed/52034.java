public void onEmailParse() {
    mostRecentDate = java.util.Calendar.getInstance().getTime();
    java.lang.String dateString = dateFormat.format(mostRecentDate.getTime());
    android.util.Log.d(com.einzig.ipst2.Activities.MainActivity.TAG, (((com.einzig.ipst2.Activities.MainActivity.MOST_RECENT_DATE_KEY) + " -> ") + dateString));
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putString(com.einzig.ipst2.Activities.MainActivity.MOST_RECENT_DATE_KEY, dateString);
    editor.apply();
}