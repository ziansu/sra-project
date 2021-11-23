public java.lang.Object getKeyFromValue(java.lang.String value) {
    try {
        readLock.lock();
        for (java.lang.Object o : FTPClientServer.FTP_Client.filesLocked.keySet()) {
            if (FTPClientServer.FTP_Client.filesLocked.get(o).equals(value)) {
                java.lang.System.out.println(("Before returning from getvale: " + o));
                return o;
            }
        }
    } catch (java.lang.Exception e) {
    } finally {
        readLock.unlock();
    }
    return null;
}