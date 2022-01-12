private void setProgressButtonEnabled(boolean progressButtonEnabled) {
    this.progressButtonEnabled = progressButtonEnabled;
    if (progressButtonEnabled) {
        if ((pager.getCurrentItem()) == ((slidesNumber) - 1)) {
            setButtonState(nextButton, false);
            setButtonState(doneButton, true);
        }else {
            setButtonState(nextButton, true);
            setButtonState(doneButton, false);
        }
    }else {
        setButtonState(nextButton, false);
        setButtonState(doneButton, false);
    }
}