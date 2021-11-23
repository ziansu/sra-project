@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle saveInstanceState) {
    android.util.Log.e(edu.washington.ruokua.quizdroid.QuizDroidModel.TAG, "cao cao cao");
    saveInstanceState.putInt("topicIndex", topicIndex);
    saveInstanceState.putString("topic", topic);
    saveInstanceState.putInt("numQuestion", numQuestion);
    saveInstanceState.putInt("questionNum", questionNum);
    saveInstanceState.putBoolean("takeQuiz", takeQuiz);
    super.onSaveInstanceState(saveInstanceState);
}