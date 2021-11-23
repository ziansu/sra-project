private void refreshOnScreenInformation() {
    mCurrentExerciseName = mProgram.getNextExercise().getName();
    mCurrentRestingTime = mProgram.getNextRestingTime();
    mTimeRemaining.setText(mCurrentRestingTime);
    mExerciseName.setText(mCurrentRestingTime);
}