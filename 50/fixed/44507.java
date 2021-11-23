@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (mGuideViewPage.dispatchKeyGuidePage(event)) {
        return true;
    }
    return super.dispatchKeyEvent(event);
}