@java.lang.Override
public void onClick(android.view.View v) {
    if (mFab.isOpened()) {
        mFab.close(true);
    }else {
        mFab.open(true);
    }
}