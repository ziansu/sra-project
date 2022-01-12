@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    topicIndex = savedInstanceState.getInt("topicIndex");
    topic = savedInstanceState.getString("topic");
    numQuestion = savedInstanceState.getInt("numQuestion");
    questionNum = savedInstanceState.getInt("questionNum");
    takeQuiz = savedInstanceState.getBoolean("takeQuiz");
}