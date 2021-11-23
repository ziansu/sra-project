public int progress() {
    return ((int) ((100.0 * ((float) (bytesRead))) / ((float) (totalBytes))));
}