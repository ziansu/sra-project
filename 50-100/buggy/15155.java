protected void writeToExternalStorageFile(java.lang.String filename, java.lang.String text) throws java.io.FileNotFoundException, java.io.IOException {
    if (isExternalStorageWritable()) {
        externalStorageDirectory = new java.io.File(android.os.Environment.getExternalStorageDirectory(), this.getPackageName());
        externalStorageDirectory.mkdir();
        writeToFile(new java.io.File(externalStorageDirectory, filename), text);
    }
}