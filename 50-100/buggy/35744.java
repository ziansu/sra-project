public void onSurveySelected(org.eyeseetea.malariacare.database.model.Survey survey) {
    if ((survey.getStatus()) == (org.eyeseetea.malariacare.utils.Constants.SURVEY_PLANNED)) {
        survey = org.eyeseetea.malariacare.database.utils.planning.SurveyPlanner.getInstance().startSurvey(survey);
    }
    org.eyeseetea.malariacare.database.utils.Session.setSurvey(survey);
    dashboardActivity.prepareLocationListener(survey);
    if ((surveyFragment) == null) {
        surveyFragment = org.eyeseetea.malariacare.fragments.SurveyFragment.newInstance(1);
    }
    replaceFragment(R.id.dashboard_details_container, surveyFragment);
    org.eyeseetea.malariacare.layout.utils.LayoutUtils.setActionBarTitleForSurvey(dashboardActivity, org.eyeseetea.malariacare.database.utils.Session.getSurvey());
}