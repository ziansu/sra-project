@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.group6a_hw03.group6a_hw03.Question> question) {
    super.onPostExecute(question);
    fActivityLoadProgress.dismiss();
    com.group6a_hw03.group6a_hw03.Trivia_Activity.fQuestionData = question;
    if (question.isEmpty()) {
        showToast("No questions currently in the database");
        quitActivity();
    }else {
        showToast(("Total Questions:" + (java.lang.String.valueOf(com.group6a_hw03.group6a_hw03.Trivia_Activity.fQuestionData.size()))));
        displayDetails();
    }
}