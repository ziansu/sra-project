public void update(int i) {
    checkRes(i);
    if ((stage) < (TOTAL_QUESTIONS)) {
        (stage)++;
        newQuestion(list.get(((stage) - 1)));
    }else {
        returnIntent.putExtra("score2", score);
        returnIntent.putExtra("total2", TOTAL_QUESTIONS);
        setResult(app.example.com.quiz.RESULT_OK, returnIntent);
        finish();
    }
}