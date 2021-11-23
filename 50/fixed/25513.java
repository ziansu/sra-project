public void onMarkAsCompleted(org.eyeseetea.malariacare.data.database.model.Survey survey) {
    org.eyeseetea.malariacare.data.database.utils.SurveyAnsweredRatio surveyAnsweredRatio = survey.getAnsweredQuestionRatio();
    if (!(surveyAnsweredRatio.isCompulsoryCompleted())) {
        alertCompulsoryQuestionIncompleted();
        return ;
    }
    alertAreYouSureYouWantToComplete(survey);
}