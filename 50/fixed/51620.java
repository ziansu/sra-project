private android.os.Handler getDecryptingThreadHandler() {
    if (null == (mDecryptingHandler)) {
        mDecryptingHandler = new android.os.Handler(mDecryptingHandlerThread.getLooper());
    }
    if (null == (mDecryptingHandler)) {
        return mUIHandler;
    }
    return mDecryptingHandler;
}