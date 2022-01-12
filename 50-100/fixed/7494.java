public void onClick(android.view.View view) {
    if ((AnswerABoolean) == true) {
        AnswerAButton.setBackgroundColor(getResources().getColor(R.color.goodAnswer));
        incrementResultForGoodAnswer();
    }else {
        AnswerAButton.setBackgroundColor(getResources().getColor(R.color.badAnswer));
        findTHeRightAnswer();
    }
}