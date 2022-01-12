@java.lang.Override
public void gotData(byte[] data, int offset, int length) {
    synchronized(receiveLock) {
        for (int i = offset; i < (offset + length); i++)
            inDataBuffer.add(data[i]);
        
        newDataReceived = true;
        receiveLock.notify();
    }
    for (com.blackwhitesoftware.pandalight.remote_control.ConnectionListener l : connectionListeners)
        l.gotData(data, offset, length);
    
}