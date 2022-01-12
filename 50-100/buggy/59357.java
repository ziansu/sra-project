public static void writeTimes(java.util.List<java.lang.Double> insertionTimes, java.io.File outputPath) {
    try (java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(outputPath))) {
        for (java.lang.Double insertionTime : insertionTimes) {
            out.write(java.lang.String.format("%d\n", java.lang.String.valueOf(insertionTime)));
        }
    } catch (java.io.IOException e) {
        throw new eu.socialsensor.main.BenchmarkingException(("unable to write times to: " + (outputPath.getAbsolutePath())), e);
    }
}