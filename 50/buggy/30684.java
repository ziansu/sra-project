public java.lang.String getIp() {
    synchronized(mSocketLock) {
        if ((android.text.TextUtils.isEmpty(mIpAddress)) && ((mSocket) != null)) {
            mIpAddress = mSocket.getInetAddress().getHostAddress();
        }
    }
    return mIpAddress;
}