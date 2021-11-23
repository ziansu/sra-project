public void drawView() {
    android.util.Log.v("stepsView", "draw view");
    if ((mTotalSteps) == 0) {
        throw new java.lang.IllegalArgumentException("Total steps cannot be zero.");
    }
    if (((mCompletedPosition) < 0) || ((mCompletedPosition) > ((mTotalSteps) - 1))) {
        throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("Index : %s, Size : %s", mCompletedPosition, mLabels.length));
    }
    mStepsViewIndicator.invalidate();
}