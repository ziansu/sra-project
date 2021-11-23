public void insertBytes(byte[] space, int pos) throws java.io.IOException {
    int offset = pos * (FileProcessor.BLOCK_SIZE);
    file.seek(offset);
    file.write(space);
}