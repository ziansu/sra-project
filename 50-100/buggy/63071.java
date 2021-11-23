private static void transferFileToCompleted(java.io.File inputFile, java.lang.String completedFile) {
    try {
        java.nio.file.Files.move(java.nio.file.Paths.get(inputFile.getAbsoluteFile().toString()), java.nio.file.Paths.get(completedFile));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}