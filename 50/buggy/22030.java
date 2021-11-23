public void copyLengthBytes(int length) {
    intToByte4(length, metaData, current_offset);
    current_offset += SerialConfig.BLOCK_LENGTH_NUM;
}