private void collectSurveyFormAndSensorData() {
    if (!(checkFormComplete())) {
        android.app.AlertDialog surveyForm = surveyFormDialog(this);
        surveyForm.show();
        android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(surveyReceiver, new android.content.IntentFilter("survey-complete"));
    }else {
        us.michaelchen.compasslogger.utils.MasterSwitch.on(this);
    }
}