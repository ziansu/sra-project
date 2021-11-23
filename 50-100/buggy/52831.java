public void resetToTop() {
    try {
        this.jbHeaderScroll.animateHeaderDown();
        wvBrowser.setY(rlToolbarCont.getHeight());
    } catch (java.lang.Exception ex) {
        android.util.Log.e(LOG_TAG, ("animateHeaderDown: " + (ex.toString())));
    }
}