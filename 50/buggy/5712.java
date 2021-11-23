@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mlastClickedColumn) == ((mColumns) - 1)) {
        scrollToEnd();
    }
    mBoardView.scrollToColumn(mlastClickedColumn, false);
}