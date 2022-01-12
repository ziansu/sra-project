@java.lang.Override
protected void onWindowVisibilityChanged(int visibility) {
    super.onWindowVisibilityChanged(visibility);
    handleVisibilityChangedEvent(visibility, getVisibility());
}