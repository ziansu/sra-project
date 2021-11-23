@java.lang.Override
public void onClick(android.view.View v) {
    org.eyeseetea.malariacare.DashboardActivity activity = ((org.eyeseetea.malariacare.DashboardActivity) (context));
    if ((survey.getStatus()) == (org.eyeseetea.malariacare.utils.Constants.SURVEY_PLANNED)) {
        survey = org.eyeseetea.malariacare.database.utils.planning.SurveyPlanner.getInstance().startSurvey(survey);
    }
    activity.prepareLocationListener(survey);
    activity.initSurveyFromPlanning();
}