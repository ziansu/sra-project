public static void clearTemporaryFiles(android.content.Context context) {
    java.io.File file = new java.io.File(((android.os.Environment.getExternalStorageDirectory().getAbsolutePath()) + "/temp"));
    if (file.exists()) {
        final java.io.File to = new java.io.File(file.getAbsolutePath());
        boolean success = file.renameTo(to);
        success = file.delete();
    }
}