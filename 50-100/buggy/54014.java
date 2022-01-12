public int readUnsignedByte() {
    byte b;
    if ((bitOffset) != 0) {
        b = ((byte) (((data[byteOffset]) << (bitOffset)) | ((data[((byteOffset) + 1)]) >> (8 - (bitOffset)))));
    }else {
        b = data[byteOffset];
    }
    (byteOffset)++;
    return b & 255;
}