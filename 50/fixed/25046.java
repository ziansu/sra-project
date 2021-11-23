private boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return (Environment.MEDIA_MOUNTED.equals(state)) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state));
}