private void updateWizardControls() {
    previousButton.setEnabled((!(wizard.isFirstStep())));
    previousButton.setText(getBackButtonLabel());
    nextButton.setEnabled(wizard.canGoNext());
    nextButton.setText((wizard.isLastStep() ? getFinishButtonText() : getNextButtonLabel()));
}