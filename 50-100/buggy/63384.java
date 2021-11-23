public void writeStatsFile(java.lang.String file, long duration) {
    processSolutions();
    java.io.PrintWriter writer;
    try {
        writer = new java.io.PrintWriter(file, "UTF-8");
    } catch (java.io.FileNotFoundException | java.io.UnsupportedEncodingException e) {
        throw new java.lang.RuntimeException(e);
    }
    writer.println(getHeader(duration));
    writer.println();
    writer.println(getModes());
    writer.println();
    writer.println(getProbs());
    writer.println();
    writer.close();
}