@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    android.content.Intent surveysIntent = new android.content.Intent(this, org.eyeseetea.malariacare.services.SurveyService.class);
    surveysIntent.putExtra(SurveyService.SERVICE_METHOD, SurveyService.RELOAD_DASHBOARD_ACTION);
    this.startService(surveysIntent);
}