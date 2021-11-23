int getDataOffset() {
    int offset = (offset()) + (org.kaazing.nuklei.protocol.ws.codec.Frame.LENGTH_OFFSET);
    int lengthByte1 = (uint8Get(buffer(), offset)) & (org.kaazing.nuklei.protocol.ws.codec.Frame.LENGTH_BYTE_1_MASK);
    offset += 1;
    switch (lengthByte1) {
        case 126 :
            offset += 2;
            break;
        case 127 :
            offset += 8;
            break;
        default :
            break;
    }
    if (isMasked()) {
        offset += 4;
    }
    return offset;
}