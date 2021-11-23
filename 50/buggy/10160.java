public void deInit() {
    synchronized(this) {
        if ((mConnect) != null) {
            mConnect.disconnect();
            mConnect = null;
        }
        mIsOpen = false;
    }
}