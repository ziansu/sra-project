@java.lang.Override
public VALUE get(KEY key) {
    java.lang.String s = datacache.Util.getMD5(key.toString());
    try {
        datacache.disklrucache.DiskLruCache.Snapshot snapshot = mDiskIruCache.get(s);
        if (snapshot != null) {
            java.io.InputStream inputStream = snapshot.getInputStream(0);
            VALUE value = mValueDataSaver.readFrom(inputStream);
            snapshot.close();
            return value;
        }
        snapshot.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}