@java.lang.Override
protected void onResume() {
    super.onResume();
    activity = this;
    initMedicalUserSpinnerAsync();
    addSwipeElements();
}