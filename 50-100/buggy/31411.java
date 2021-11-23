@java.lang.Override
public void disconnect(java.lang.Throwable trigger) {
    try {
        if ((mSocket) != null)
            mSocket.close();
        
        mRemoteDeviceCertificate = null;
        mSocket = null;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if (((mRemoteConnectionListener) != null) && (trigger != null))
        mRemoteConnectionListener.onRemoteConnectionDidDisconnect(trigger);
    
}