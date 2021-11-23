private void collectSurveyFormAndSensorData() {
    if (!(checkFormComplete())) {
        android.app.AlertDialog surveyForm = surveyFormDialog(this);
        surveyForm.show();
        android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(surveyReceiver, new android.content.IntentFilter("survey-complete"));
        android.content.SharedPreferences prefs = getSharedPreferences(PREFS_NAME, 0);
        prefs.edit().putBoolean(PREFS_FORM_COMPLETE, true).commit();
    }else {
        us.michaelchen.compasslogger.utils.MasterSwitch.on(this);
    }
}