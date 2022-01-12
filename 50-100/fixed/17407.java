public java.lang.Object getKeyFromValue(java.lang.String value) {
    try {
        readLock.lock();
        for (java.lang.Object o : FTPClientServer.FTP_Client.filesLocked.keySet()) {
            if (FTPClientServer.FTP_Client.filesLocked.get(o).equals(value)) {
                return o;
            }
        }
    } catch (java.lang.Exception e) {
    } finally {
        readLock.unlock();
    }
    return null;
}