private void refreshOnScreenInformation() {
    mCurrentExerciseName = mProgram.getNextExercise().getName();
    mCurrentRestingTime = mProgram.getNextRestingTime();
    mTimeRemaining.setText(java.lang.Integer.toString(mCurrentRestingTime));
    mExerciseName.setText(mCurrentExerciseName);
}