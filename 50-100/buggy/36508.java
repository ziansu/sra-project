private void showNextQuestions() {
    if ((questions.size()) >= 2) {
        showFirstQuestion();
    }else {
        mQuestion.setText(R.string.no_questions_available);
        bYes.setVisibility(View.GONE);
        bNo.setVisibility(View.GONE);
        bSkip.setVisibility(View.GONE);
        bFlagged.setVisibility(View.GONE);
    }
}