@java.lang.Override
public void onClick(android.view.View view) {
    sbGotoPage.setProgress(((mMaxPage) - 1));
    mCurrentPage = mGoToPage;
    mOffsetInPage = LAST_FLOOR_OFFSET;
    showOrLoadPage();
    dialog.dismiss();
}