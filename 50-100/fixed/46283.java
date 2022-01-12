private void SaveViewRange(double[] rr, boolean isLock) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(ct);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    for (int i = 0; i < (rr.length); i++) {
        github.bewantbe.audio_analyzer_for_android.AnalyzerUtil.putDouble(editor, ("view_range_rr_" + i), rr[i]);
    }
    editor.putBoolean("view_range_lock", isLock);
    editor.commit();
}