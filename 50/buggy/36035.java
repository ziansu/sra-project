public int progress() {
    return ((int) ((((float) (bytesRead)) / ((float) (totalBytes))) * 100.0));
}