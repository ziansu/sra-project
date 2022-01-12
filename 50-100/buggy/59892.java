private void reportProgress(int delta) {
    progress.getAndAdd(delta);
    int p = (((int) ((((double) (progress.get())) / ((double) (maxProgress))) * 100)) / 10) * 10;
    if ((p > (lastProgress)) && (p < 100)) {
        lastProgress = p;
        java.lang.System.out.print((p + "% "));
    }
}