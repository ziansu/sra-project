public java.lang.String loadResultOfSurvey(long surveyId) {
    java.lang.System.out.println(("Loading result" + surveyId));
    this.surveyResult = surveyResultLocal.getSurveyResult(surveyId);
    return initBean();
}