private void logContent(int logLevel, java.lang.String tagSuffix, java.lang.String chunk) {
    java.lang.String[] lines = chunk.split("\n");
    for (java.lang.String line : lines) {
        logChunk(logLevel, tagSuffix, ((HorizontalDoubleLine()) + line));
    }
}