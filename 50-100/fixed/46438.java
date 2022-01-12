@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle saveInstanceState) {
    saveInstanceState.putInt("topicIndex", topicIndex);
    saveInstanceState.putString("topic", topic);
    saveInstanceState.putInt("numQuestion", numQuestion);
    saveInstanceState.putInt("questionNum", questionNum);
    saveInstanceState.putBoolean("takeQuiz", takeQuiz);
    super.onSaveInstanceState(saveInstanceState);
}