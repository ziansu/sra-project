@java.lang.Override
protected void onReset() {
    super.onReset();
    this.onStopLoading();
    if ((this.mResult) != null) {
        this.mResult = null;
    }
    this.mObserver.unregisterForContentChanges(this.getContext());
}