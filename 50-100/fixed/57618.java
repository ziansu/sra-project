private void onStepCompleted(boolean isComplete, org.codepond.wizardroid.WizardStep step) {
    if (step != (getCurrentStep()))
        return ;
    
    int stepPosition = getCurrentStepPosition();
    if ((mWizardFlow.isStepCompleted(stepPosition)) != isComplete) {
        mWizardFlow.setStepCompleted(stepPosition, isComplete);
        mCallbacks.onStepChanged();
    }
}