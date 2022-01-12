public byte[] read(long pOffset) throws java.sql.SQLException {
    short blockType;
    short offset = ((short) (pOffset & 255));
    if (offset == 255) {
        blockType = com.googlecode.paradox.metadata.BlobTable.SINGLE_BLOCK;
    }else {
        blockType = com.googlecode.paradox.metadata.BlobTable.SUB_BLOCK;
    }
    int blockNum = getBlockNum(pOffset);
    if (!(isParsed)) {
        open();
        parse();
    }
    return getData(blockNum, blockType, offset);
}