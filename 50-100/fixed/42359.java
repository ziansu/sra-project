public static boolean writeToFile(java.lang.String filePath, java.lang.String characterName, java.lang.String output) {
    if ((filePath == null) || (output == null)) {
        return false;
    }
    try {
        java.nio.file.Files.write(java.nio.file.Paths.get(filePath, "\\", (characterName + ".txt")), output.getBytes());
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}