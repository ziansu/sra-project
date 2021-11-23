public void listQuestion(int surveyId) {
    android.content.Intent intent = new android.content.Intent(this, survey.shakya.sugan.surveyapp.activity.ListQuestionForSurveyerActivity.class);
    intent.putExtra("SURVEY_ID", surveyId);
    this.startActivity(intent);
}