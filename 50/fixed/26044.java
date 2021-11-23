@java.lang.Override
public void onClick(android.view.View view) {
    if ((mCurrentPage) < (mMaxPage)) {
        (mCurrentPage)++;
        showOrLoadPage();
    }
    dialog.dismiss();
}