private void checkIfTilesAreCorrect() {
    int correctAnswers = prefs.getInt(Constants.CORRECT_ADD_ANSWERS, 0);
    if (!(isFirstAnswerCorrect)) {
        boolean isCorrect = eq.isAdditionAnswerCorrect(layoutLeftX.currXVal, layoutLeftOne.currOneVal, layoutRightX.currXVal, layoutRightOne.currOneVal);
        android.util.Log.d(com.freelance.jptalusan.algeops.Activities.AddActivity.TAG, ("Check if 1st is correct: " + isCorrect));
        if (isCorrect) {
            isFirstAnswerCorrect = true;
            xSeekbar.getViewDimensions();
            oneSeekbar.getViewDimensions();
            cancelOutViews();
            setAllButtonsClickabilitiy(false);
        }
    }
}