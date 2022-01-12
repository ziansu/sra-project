public void worked(int workIncrement, int remainingWork) {
    if (verbose) {
        java.lang.String file = (remainingWork == 1) ? "file" : "files";
        logger.info((((remainingWork + " ") + file) + " left."));
        count += 1;
    }
}