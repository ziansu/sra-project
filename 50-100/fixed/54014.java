public int readUnsignedByte() {
    int value;
    if ((bitOffset) != 0) {
        value = ((data[byteOffset]) << (bitOffset)) | (((data[((byteOffset) + 1)]) & 255) >>> (8 - (bitOffset)));
    }else {
        value = data[byteOffset];
    }
    (byteOffset)++;
    return value & 255;
}