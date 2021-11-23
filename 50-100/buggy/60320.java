private static boolean isEmptyFile() {
    java.io.FileReader fr = null;
    boolean isNothingRead = true;
    try {
        fr = new java.io.FileReader(storage.Storage.FILENAME);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    try {
        if ((fr.read()) == (-1)) {
            return isNothingRead;
        }
    } catch (java.io.IOException e) {
        isNothingRead = false;
    }
    return isNothingRead;
}