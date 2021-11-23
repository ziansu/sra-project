public int calculateBlocks() throws java.io.IOException {
    long size = file.length();
    blockNumber = ((int) ((FileProcessor.BLOCK_SIZE) / size));
    return blockNumber;
}