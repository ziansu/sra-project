private void playMedia() {
    java.lang.String title = null;
    if ((getMediaStateListener()) != null)
        title = getMediaStateListener().getTitle();
    
    playUri(mLocalVideoUri, title, mStartPositionMillis);
}