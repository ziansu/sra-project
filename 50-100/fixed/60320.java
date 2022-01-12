private static boolean isEmptyFile() {
    java.io.FileReader fr = null;
    try {
        fr = new java.io.FileReader(storage.Storage.FILENAME);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    try {
        if ((fr.read()) == (-1)) {
            return true;
        }
    } catch (java.io.IOException e) {
        return true;
    }
    return false;
}