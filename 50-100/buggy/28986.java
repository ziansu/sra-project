static void pushAlt(com.ociweb.pronghorn.util.TrieParserReader reader, int pos, int offset, int runLength) {
    reader.altStackA[reader.altStackPos] = offset;
    reader.altStackB[reader.altStackPos] = reader.capturedPos;
    reader.altStackC[((reader.altStackPos)++)] = pos;
    reader.altStackD[reader.altStackPos] = runLength;
}