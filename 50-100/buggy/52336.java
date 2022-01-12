public static void main(final java.lang.String... args) throws java.io.FileNotFoundException, java.io.IOException {
    final java.lang.String[] filenames = de.kifaru.ndegendogo.kata.fakeOs.Cat.getFilenames(args);
    for (final java.lang.String name : filenames) {
        final boolean result = de.kifaru.ndegendogo.kata.fakeOs.Cat.printFile(name);
    }
}