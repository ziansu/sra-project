public void load(java.lang.String url, com.sqbnet.expressassistant.utils.AsyncImageLoader.ImageLoadResultLister callback) {
    mTaskMap.remove(callback);
    mTaskMap.put(callback, url);
    if (mIsWait) {
        synchronized(this) {
            this.notify();
        }
    }
}