public void show() {
    if (myHideAnim.isStarted()) {
        try {
            myHideAnim.cancel();
        } catch (java.lang.RuntimeException ex) {
            myLogger.error("Failed to cancel animation.", ex);
        }
        return ;
    }
    if ((myShowAnim.isStarted()) || ((getVisibility()) == (android.view.View.VISIBLE))) {
        return ;
    }
    myShowAnim.start();
}