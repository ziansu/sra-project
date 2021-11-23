public void onClick(android.view.View view) {
    if ((AnswerCBoolean) == true) {
        AnswerCButton.setBackgroundColor(getResources().getColor(R.color.goodAnswer));
        android.os.SystemClock.sleep(4000);
        incrementResultForGoodAnswer();
    }else {
        AnswerCButton.setBackgroundColor(getResources().getColor(R.color.badAnswer));
        android.os.SystemClock.sleep(4000);
        findTHeRightAnswer();
    }
}