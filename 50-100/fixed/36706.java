@java.lang.Override
public void onClick(android.view.View v) {
    org.eyeseetea.malariacare.BaseActivity activity = ((org.eyeseetea.malariacare.DashboardActivity) (context));
    if ((survey.getStatus()) == (org.eyeseetea.malariacare.utils.Constants.SURVEY_PLANNED)) {
        survey = org.eyeseetea.malariacare.database.utils.planning.SurveyPlanner.getInstance().startSurvey(survey);
    }
    org.eyeseetea.malariacare.database.utils.Session.setSurvey(survey);
    activity.prepareLocationListener(survey);
}