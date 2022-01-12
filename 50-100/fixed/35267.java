public byte[] read(long pOffset) throws java.sql.SQLException {
    short offset = ((short) (pOffset & 255));
    int blockNum = getBlockNum(pOffset);
    if (!(isParsed)) {
        open();
        parse();
    }
    return getData(blockNum, offset);
}