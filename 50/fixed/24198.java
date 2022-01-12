public void setBusy(boolean isBusy) {
    this.isBusy = isBusy;
    callListenerThread.setBusy(isBusy);
}