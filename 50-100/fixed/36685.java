private static boolean fileExists(java.lang.String filePath) {
    try {
        java.io.File f = new java.io.File(filePath);
        java.io.FileWriter fileCreate = new java.io.FileWriter(f, true);
        if (f.exists()) {
            fileCreate.close();
            return true;
        }else {
            fileCreate.close();
            return false;
        }
    } catch (java.io.IOException e) {
        java.lang.System.err.println(("Error: " + (e.getMessage())));
    }
    return false;
}