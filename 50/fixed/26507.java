public int calculateBlocks() throws java.io.IOException {
    long size = file.length();
    blockNumber = ((int) (size / (FileProcessor.BLOCK_SIZE)));
    return blockNumber;
}