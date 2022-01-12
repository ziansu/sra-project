@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    textSize = i + 16;
    changeFontSize();
    prefs.edit().remove(getString(R.string.pref_lesson_text_size)).apply();
    prefs.edit().putInt(getString(R.string.pref_lesson_text_size), i).apply();
}