@java.lang.Override
public void onClick(android.view.View v) {
    if (mFab.isOpened()) {
        mFab.close(false);
    }else {
        mFab.open(false);
    }
}