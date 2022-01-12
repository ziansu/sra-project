private void setAnswerShownResult(boolean isAnswerShown) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(com.microlands.android.geoquiz.CheatActivity.EXTRA_ANSWER_SHOWN, isAnswerShown);
    setResult(com.microlands.android.geoquiz.RESULT_OK, data);
}