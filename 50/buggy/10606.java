@java.lang.Override
public boolean setBackupLogger(java.lang.String bl) throws java.rmi.RemoteException {
    return net.logSer.LogHandler.setBackupLog(url);
}