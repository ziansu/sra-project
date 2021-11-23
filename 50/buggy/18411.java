@butterknife.OnClick(value = R.id.btn_next_step)
public void nextStep(android.view.View v) {
    nextButtonClickListener.onNextButtonClick(currentStep.getId());
}