private java.lang.String loadLocalFile(@android.support.annotation.RawRes
int id) throws java.io.IOException {
    java.io.InputStream is = mContext.getResources().openRawResource(id);
    byte[] buffer = new byte[is.available()];
    is.read(buffer);
    is.close();
    return new java.lang.String(buffer);
}