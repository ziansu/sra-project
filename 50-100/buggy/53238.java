public void update(int ch) {
    if ((stage) < (TOTAL_QUESTIONS)) {
        (stage)++;
        checkRes(ch);
        newQuestion(list.get(((stage) + 1)));
    }else {
        returnIntent.putExtra("score", score);
        returnIntent.putExtra("total", TOTAL_QUESTIONS);
        setResult(app.example.com.quiz.RESULT_OK, returnIntent);
        finish();
    }
}