static boolean copyFile(final java.lang.String filename, final java.io.OutputStream to) throws java.io.IOException {
    try (java.io.FileInputStream input = new java.io.FileInputStream(filename);java.io.BufferedInputStream bufferedIn = new java.io.BufferedInputStream(input)) {
        de.kifaru.ndegendogo.kata.fakeOs.Cat.copyStream(bufferedIn, to);
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.exit(1);
    }
    return true;
}