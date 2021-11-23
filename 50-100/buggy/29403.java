private int unInterlaceFromInt(int outputValue, int outputBitPos, int intValue, int intBitPosition, int interlaceInterval) {
    while ((intBitPosition > (-1)) && (outputBitPos > (-1))) {
        outputValue += intValue & ((com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << intBitPosition);
        intBitPosition -= interlaceInterval;
        outputBitPos--;
    } 
    return outputValue;
}