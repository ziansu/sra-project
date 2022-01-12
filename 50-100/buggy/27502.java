@java.lang.Override
public java.lang.Object getContentsOfFileOrNull(java.io.File file) {
    java.io.FileInputStream fis = null;
    java.io.ObjectInputStream ois = null;
    try {
        fis = new java.io.FileInputStream(file);
        ois = new java.io.ObjectInputStream(fis);
        return ois.readObject();
    } catch (java.lang.Exception e) {
        return null;
        Logger.log.logError("error reading file", e);
    } finally {
        com.sensorberg.sdk.internal.AndroidFileManager.Closeables.close(fis);
        com.sensorberg.sdk.internal.AndroidFileManager.Closeables.close(ois);
    }
}