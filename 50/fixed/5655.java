public void changeView(int quizIndex) {
    android.content.Intent intent = new android.content.Intent(context, questioneerActivityClass);
    intent.putExtra("quiz", model.getQuiz(quizIndex));
    currentActivity.startActivity(intent);
}