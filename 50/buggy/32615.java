@java.lang.Override
public void addQuestion(java.lang.String url) {
    tcss450.uw.edu.mobileproject.HomeActivity.AddQuestionTask task = new tcss450.uw.edu.mobileproject.HomeActivity.AddQuestionTask();
    task.execute(new java.lang.String[]{ url.toString() });
    getSupportFragmentManager().popBackStackImmediate();
}