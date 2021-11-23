public com.opencsv.FileBuffer write(char c) throws java.io.IOException {
    bList[((bLen)++)] = ((byte) (c));
    fill(false);
    return this;
}