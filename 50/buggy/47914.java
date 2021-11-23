@java.lang.Override
public void onChange(boolean selfChange) {
    selectedPositionList = dialogsListView.getFirstVisiblePosition();
    initCursorLoaders();
}