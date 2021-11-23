@java.lang.Override
public void onMultiPageStateChanged(boolean isMultiPage) {
    if ((paginationView) != null) {
        paginationView.show(isMultiPage);
    }
}