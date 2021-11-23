private void doUnbindService() {
    try {
        mContext.unbindService(mConnection);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}