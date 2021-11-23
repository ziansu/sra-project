public void submitAnswers(android.view.View view) {
    score += questionNo1();
    score += questionNo2();
    score += questionNo3();
    score += questionNo4();
    score += questionNo5();
    score += questionNo6();
    score += questionNo7();
    score += questionNo8();
    score += questionNo9();
    score += questionNo10();
    android.content.Intent mainToResultsIntent = new android.content.Intent(this, com.example.android.quizapp.ResultsActivity.class);
    mainToResultsIntent.putExtra("correct", score);
    startActivity(mainToResultsIntent);
    score = 0;
}