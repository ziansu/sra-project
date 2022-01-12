public static void writeDatasetToFile(java.lang.String fileName, int n) throws java.io.IOException {
    java.io.File file = new java.io.File(fileName);
    java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
    java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(fos));
    for (int i = 1; i <= n; i++) {
        bw.write(generator.PuzzleGenerator.encode(generator.PuzzleGenerator.generate()));
        bw.newLine();
    }
    bw.close();
}