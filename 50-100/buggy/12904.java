@java.lang.Override
public void put(KEY key, VALUE data) {
    java.lang.String s = datacache.Util.getMD5(key.toString());
    try {
        datacache.disklrucache.DiskLruCache.Editor editor = mDiskIruCache.edit(s);
        if (editor != null) {
            java.io.OutputStream outputStream = editor.newOutputStream(0);
            mValueDataSaver.writeTo(outputStream, data);
        }
        editor.commit();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}