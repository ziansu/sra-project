@java.lang.Override
public void onGlobalLayout() {
    android.graphics.Rect rect = new android.graphics.Rect();
    mRootView.getWindowVisibleDisplayFrame(rect);
    int screenHeight = mRootView.getRootView().getHeight();
    int heightDiff = screenHeight - (rect.bottom);
    if (heightDiff > (screenHeight / 3)) {
        mIsKeyboardShow = true;
    }else {
        mIsKeyboardShow = false;
    }
}