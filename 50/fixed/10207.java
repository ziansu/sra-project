public static void getFileTests() {
    Main.numberOfException = 0;
    Main.numberOfFiles = 0;
    Main.IsBuggy(Main.path);
    Main.createTest(Main.path);
}