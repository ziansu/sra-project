private synchronized boolean removeThreadFromList(final long threadId, boolean closeSocketAndStreams) {
    boolean threadRemoved = false;
    for (org.thaliproject.p2p.btconnectorlib.utils.BluetoothSocketIoThread thread : mSocketIoThreads) {
        if ((thread != null) && ((thread.getId()) == threadId)) {
            android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.BluetoothServerThread.TAG, ("removeThreadFromList: Removing thread with ID " + threadId));
            mSocketIoThreads.remove(thread);
            if (closeSocketAndStreams) {
                thread.close(true);
            }
            threadRemoved = true;
            break;
        }
    }
    return threadRemoved;
}