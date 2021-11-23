private void copyHeaderSignature(int signature) {
    intToByte1(signature, metaData, current_offset);
    current_offset += SerialConfig.HEADER_SIZE;
}