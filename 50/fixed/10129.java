private void processWordsByRow(java.util.List<java.lang.String> lines) {
    for (java.lang.String line : common.PDFContainer.words) {
        countWordOccurence(line);
    }
}