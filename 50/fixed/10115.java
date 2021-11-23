public void stop() {
    synchronized(this) {
        if ((mDisposable) != null) {
            mDisposable.dispose();
            mDisposable = null;
        }
    }
}