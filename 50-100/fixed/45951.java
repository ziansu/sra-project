private int insertNewSafePoint(int pos, byte[] source, int sourcePos, int sourceLength, int sourceMask, long value, int runLenPos) {
    makeRoomForInsert(sourceLength, pos, SIZE_OF_SAFE_END);
    data[(pos++)] = com.ociweb.pronghorn.util.TrieParser.TYPE_SAFE_END;
    pos = writeEndValue(pos, value);
    pos = writeRunHeader(pos, sourceLength);
    data[runLenPos] -= sourceLength;
    return pos;
}