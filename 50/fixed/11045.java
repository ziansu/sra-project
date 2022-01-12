public boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return Environment.MEDIA_MOUNTED.equals(state);
}