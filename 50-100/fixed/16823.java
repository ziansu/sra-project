public void write(@android.support.annotation.NonNull
byte[] data, int i1, int i2) {
    java.lang.String str = new java.lang.String(data);
    str = str.replace("\n", "").replace("\r", "");
    if ((!(str.equals(""))) && (!(str.equals("")))) {
        broadcastStatus("progress_stream", str);
    }
}