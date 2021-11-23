@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    spref = getSharedPreferences(MainActivity.PREFS_NAME, 0);
    android.content.SharedPreferences.Editor editor = spref.edit();
    editor.putInt("theme", java.lang.Integer.parseInt(newValue.toString()));
    editor.commit();
    android.content.Intent intent = new android.content.Intent(this, com.scan.chat.android.androidchatscan.activities.ChatActivity.class);
    ChatActivity.mChatActivity.finish();
    startActivity(intent);
    finish();
    return true;
}