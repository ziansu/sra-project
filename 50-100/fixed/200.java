protected java.lang.String readTextFromExternalStorage(java.lang.String fileName) throws java.io.FileNotFoundException, java.io.IOException {
    java.lang.String readString = "";
    if (isExternalStorageReadable()) {
        if ((externalStorageDirectory) == null) {
            externalStorageDirectory = new java.io.File(android.os.Environment.getExternalStorageDirectory(), getPackageName());
        }
        readString = readFromFile(new java.io.File((((externalStorageDirectory.getAbsolutePath()) + "/") + fileName)));
    }
    return readString;
}