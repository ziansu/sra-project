public void setImageProcessorBusy(boolean imageProcessorBusy) {
    this.imageProcessorBusy = imageProcessorBusy;
    if (!imageProcessorBusy) {
        mWaitSpinner.setVisibility(View.GONE);
    }
}