@java.lang.SuppressWarnings(value = "deprecation")
private static int getSize(android.os.StatFs statFs) {
    int blockSize = statFs.getBlockSize();
    int availableBlocks = statFs.getAvailableBlocks();
    int size = (blockSize * availableBlocks) / (1024 * 1024);
    return size;
}