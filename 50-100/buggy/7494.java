public void onClick(android.view.View view) {
    if ((AnswerABoolean) == true) {
        AnswerAButton.setBackgroundColor(getResources().getColor(R.color.goodAnswer));
        android.os.SystemClock.sleep(4000);
        incrementResultForGoodAnswer();
    }else {
        AnswerAButton.setBackgroundColor(getResources().getColor(R.color.badAnswer));
        findTHeRightAnswer();
    }
}