public com.opencsv.FileBuffer write(char c) throws java.io.IOException {
    if ((bList) == null)
        return this;
    
    bList[((bLen)++)] = ((byte) (c));
    fill(false);
    return this;
}