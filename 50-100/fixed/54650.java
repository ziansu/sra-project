@java.lang.Override
public void onBackPressed() {
    if (basePreferenceActivity) {
        android.content.Intent i = new android.content.Intent(this, com.texasgamer.zephyr.MainActivity.class);
        i.addFlags((((android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(i);
    }else {
        android.content.Intent i = new android.content.Intent(this, com.texasgamer.zephyr.PreferencesActivity.class);
        i.addFlags((((android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP) | (android.content.Intent.FLAG_ACTIVITY_NEW_TASK)) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(i);
    }
}