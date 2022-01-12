void scanNextPath() {
    if ((mNextPath) >= (mPaths.length)) {
        mConnection.disconnect();
        return ;
    }
    java.lang.String mimeType = ((mMimeTypes) != null) ? mMimeTypes[mNextPath] : null;
    mConnection.scanFile(mPaths[mNextPath], mimeType);
    (mNextPath)++;
}