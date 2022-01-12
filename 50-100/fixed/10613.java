private void flush() throws java.io.IOException {
    try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(gameFile, true))) {
        batch.append("\n\n");
        bw.write(batch.toString());
    }
    batch = new java.lang.StringBuffer();
    currentBatchSize = 0;
    gameStateRecorded = false;
}