private void createFile() {
    java.lang.System.out.println("Beginning method createFile()");
    java.io.File file = new java.io.File(context.getFilesDir(), filename);
    try {
        file.createNewFile();
        java.lang.System.out.println("Successfully created file");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Failure..2.");
        android.util.Log.e("Exception", ("File Create Failed: " + (e.toString())));
    }
}