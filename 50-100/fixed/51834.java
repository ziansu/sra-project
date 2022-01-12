@java.lang.Override
protected void onStop() {
    super.onStop();
    android.content.SharedPreferences settings = getSharedPreferences(vocabletrainer.heinecke.aron.vocabletrainer.Activities.MainActivity.PREFS_NAME, 0);
    android.content.SharedPreferences.Editor editor = settings.edit();
    editor.putBoolean(vocabletrainer.heinecke.aron.vocabletrainer.Activities.TrainerSettingsActivity.P_KEY_TS_ALLOW_HINTS, bHints.isChecked());
    editor.putInt(vocabletrainer.heinecke.aron.vocabletrainer.Activities.TrainerSettingsActivity.P_KEY_TS_TRAIN_MODE, getChecked());
    editor.putString(vocabletrainer.heinecke.aron.vocabletrainer.Activities.TrainerSettingsActivity.P_KEY_TS_TIMES_VOCABLE, tTimesVocable.getText().toString());
    editor.putBoolean(vocabletrainer.heinecke.aron.vocabletrainer.Activities.TrainerSettingsActivity.P_KEY_TS_CASE_SENSITIVE, bCaseSensitive.isChecked());
    editor.apply();
}