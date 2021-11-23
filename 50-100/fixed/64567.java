public com.dwtech.android.houyi.HouyiScene load(byte[] data, int size, java.lang.String filePath, int options) {
    long scene = nativeLoad(data, size, (filePath == null ? "" : filePath), 1);
    return scene == 0 ? null : new com.dwtech.android.houyi.HouyiScene(scene);
}