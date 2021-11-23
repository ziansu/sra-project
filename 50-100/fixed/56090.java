private void createFile() {
    java.io.File file = new java.io.File(context.getFilesDir(), filename);
    try {
        file.createNewFile();
    } catch (java.lang.Exception e) {
        android.util.Log.e("Exception", ("File Create Failed: " + (e.toString())));
    }
}