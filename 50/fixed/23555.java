@java.lang.Override
public void disableTrailerSharing() {
    mTrailerId = null;
    if ((mShareMenuItem) != null)
        mShareMenuItem.setVisible(false);
    
}