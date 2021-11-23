private boolean eof(huffman.BitReader reader) {
    return (reader.readBitsCount) > ((reader.length()) * 8);
}