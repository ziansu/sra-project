public io.canner.stepsview.StepsView setLabels(java.lang.String[] labels) {
    mLabels = labels;
    mStepsViewIndicator.setStepTotal(labels.length);
    mTotalSteps = labels.length;
    return this;
}