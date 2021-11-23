public java.io.File getFile() {
    final java.lang.String path = ((Environment.MEDIA_MOUNTED.equals(android.os.Environment.getExternalStorageState())) || (!(android.os.Environment.isExternalStorageRemovable()))) ? getExternalFilesDir(null).getPath() : context.getFilesDir().getPath();
    java.io.File file = new java.io.File(path);
    return file;
}