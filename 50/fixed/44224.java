@java.lang.Override
public void onClick(android.view.View view) {
    mCurrentPage = mMaxPage;
    mOffsetInPage = LAST_FLOOR_OFFSET;
    showOrLoadPage();
    dialog.dismiss();
}