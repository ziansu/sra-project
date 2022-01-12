@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, "onReceive");
    if (SurveyService.ALL_SENT_SURVEYS_ACTION.equals(intent.getAction())) {
        java.util.List<org.eyeseetea.malariacare.database.model.Survey> surveysFromService = ((java.util.List<org.eyeseetea.malariacare.database.model.Survey>) (org.eyeseetea.malariacare.database.utils.Session.popServiceValue(SurveyService.ALL_SENT_SURVEYS_ACTION)));
        reloadSurveys(surveysFromService);
    }
}