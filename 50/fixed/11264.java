public void init() {
    if (!(isInit)) {
        mLoaderCallback.onManagerConnected();
        isInit = true;
    }
}