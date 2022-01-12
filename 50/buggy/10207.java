public static void getFileTests() {
    Main.numberOfException = 0;
    Main.numberOfFiles = 0;
    java.lang.String directoryName = Main.path;
    Main.IsBuggy(directoryName);
    Main.createTest(directoryName);
}