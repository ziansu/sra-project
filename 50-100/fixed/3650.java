private void restoreLockingState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    this.baseProgressButtonEnabled = savedInstanceState.getBoolean("baseProgressButtonEnabled");
    this.progressButtonEnabled = savedInstanceState.getBoolean("progressButtonEnabled");
    this.skipButtonEnabled = savedInstanceState.getBoolean("skipButtonEnabled");
    this.savedCurrentItem = savedInstanceState.getInt("currentItem");
    pager.setPagingEnabled(savedInstanceState.getBoolean("nextEnabled"));
    pager.setNextPagingEnabled(savedInstanceState.getBoolean("nextPagingEnabled"));
    pager.setLockPage(savedInstanceState.getInt("lockPage"));
}