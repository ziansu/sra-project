public boolean checkIfFileExists(android.content.Context context) {
    java.io.File file = new java.io.File(((((((context.getFilesDir().getParent()) + (java.io.File.separator)) + "shared_prefs") + (java.io.File.separator)) + (preferenceFilename)) + ".xml"));
    return file.exists();
}