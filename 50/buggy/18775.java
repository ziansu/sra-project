@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String s) {
    textSize.setTextSize(storage.getTextSize());
    categoryText.setTextSize(storage.getTextSize());
}