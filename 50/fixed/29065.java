@java.lang.Override
protected void onEntityChanged() {
    super.onEntityChanged();
    if ((getEntity()) != null) {
        updateDataCenterVersion();
        getSearchCommand().execute();
    }
    updateActionAvailability();
}