@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(org.eyeseetea.malariacare.SurveyActivity.TAG, "onReceive");
    java.util.List<org.eyeseetea.malariacare.database.model.CompositeScore> compositeScores = ((java.util.List<org.eyeseetea.malariacare.database.model.CompositeScore>) (org.eyeseetea.malariacare.database.utils.Session.popServiceValue(SurveyService.PREPARE_SURVEY_ACTION_COMPOSITE_SCORES)));
    java.util.List<org.eyeseetea.malariacare.database.model.Tab> tabs = ((java.util.List<org.eyeseetea.malariacare.database.model.Tab>) (org.eyeseetea.malariacare.database.utils.Session.popServiceValue(SurveyService.PREPARE_SURVEY_ACTION_TABS)));
    tabAdaptersCache.reloadAdapters(tabs, compositeScores);
    reloadTabs(tabs);
    stopProgress();
}