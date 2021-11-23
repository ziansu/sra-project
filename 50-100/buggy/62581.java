@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    android.util.Log.e(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, "cao ni ma cao ni ma cao ni ma cao ni ma ");
    topicIndex = savedInstanceState.getInt("topicIndex");
    topic = savedInstanceState.getString("topic");
    numQuestion = savedInstanceState.getInt("numQuestion");
    questionNum = savedInstanceState.getInt("questionNum");
    takeQuiz = savedInstanceState.getBoolean("takeQuiz");
}