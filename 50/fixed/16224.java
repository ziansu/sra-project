public synchronized void open(android.content.Context context) {
    if ((mUsbContext) != context) {
        disconnect();
        mUsbContext = context;
    }
    if (mIsOpen)
        return ;
    
    mIsOpen = true;
    connect();
}