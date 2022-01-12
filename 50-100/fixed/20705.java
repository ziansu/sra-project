public void onClick(android.view.View view) {
    if ((AnswerCBoolean) == true) {
        AnswerCButton.setBackgroundColor(getResources().getColor(R.color.goodAnswer));
        incrementResultForGoodAnswer();
    }else {
        AnswerCButton.setBackgroundColor(getResources().getColor(R.color.badAnswer));
        findTHeRightAnswer();
    }
}