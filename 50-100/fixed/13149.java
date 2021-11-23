@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(context, editQuizActivityClass);
    java.lang.String quizTitle = quizName.getText().toString();
    int quizindex = model.getUserQuizList().size();
    model.getUserQuizList().add(new com.example.murk.kwizgeeq.model.UserQuiz(quizTitle, mSelectedColor));
    intent.putExtra("quizIndex", quizindex);
    currentActivity.startActivity(intent);
}