public long[] getByteRangeBySignatureOffset(long signatureOffset) throws java.io.IOException {
    pdfSource.seek(signatureOffset);
    skipID();
    byteRange[0] = 0;
    parseDictionary();
    byteRange[3] = ((getOffsetOfNextEOF(byteRange[2])) - (byteRange[2])) + 1;
    return byteRange;
}