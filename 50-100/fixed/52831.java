public void resetToTop() {
    try {
        if ((this.jbHeaderScroll) != null)
            this.jbHeaderScroll.animateHeaderDown();
        
        if ((wvBrowser) != null)
            wvBrowser.setY(rlToolbarCont.getHeight());
        
    } catch (java.lang.Exception ex) {
        android.util.Log.e(LOG_TAG, ("animateHeaderDown: " + (ex.toString())));
    }
}