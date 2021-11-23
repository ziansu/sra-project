public void rbsp_trailing_bits() {
    for (int i = ((bytestream.length) - 1) * 8; i > 0; i--) {
        int byte_offset = i / 8;
        int bit_offset = i % 8;
        byte valByte = bytestream[byte_offset];
        int valInt = (valByte >> (8 - (bit_offset + 1))) & 1;
        if (valInt == 1) {
            trailingBitOffSet = i;
            break;
        }
    }
}