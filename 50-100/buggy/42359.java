public boolean writeToFile(java.lang.String filePath, java.lang.String characterName, java.lang.String output) {
    try {
        java.nio.file.Files.write(java.nio.file.Paths.get(filePath, "\\", characterName, ".txt"), output.getBytes());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}