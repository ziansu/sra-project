public static boolean doesSaveFileExist() {
    java.io.File file = new java.io.File(".\\Saves\\player.txt");
    return file.exists();
}