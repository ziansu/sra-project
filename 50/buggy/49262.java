@java.lang.Override
public long onGetSize() throws android.system.ErrnoException {
    android.system.StructStat stat = null;
    try {
        stat = mFile.fstat();
        return stat.st_size;
    } catch (java.io.IOException e) {
        android.util.Log.e(com.google.android.sambadocumentsprovider.provider.SambaProxyFileCallback.TAG, "Failed to get size for file");
    }
    return 0;
}