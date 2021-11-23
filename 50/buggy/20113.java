@java.lang.Override
protected void onResume() {
    initializeDraftList(this.draftManager, this.draftListView);
    super.onResume();
}