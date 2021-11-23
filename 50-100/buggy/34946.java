private java.lang.String loadLocalFile(@android.support.annotation.RawRes
int id) throws java.io.IOException {
    java.io.InputStream is = mContext.getResources().openRawResource(R.raw.index);
    byte[] buffer = new byte[is.available()];
    is.read(buffer);
    is.close();
    return new java.lang.String(buffer);
}