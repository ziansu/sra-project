private int unInterlaceFromInt(int outputValue, int outputBitPos, int intValue, int intBitPosition, int interlaceInterval) {
    while ((intBitPosition > (-1)) && (outputBitPos > (-1))) {
        if ((intValue & ((com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << intBitPosition)) != 0) {
            outputValue += (com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << outputBitPos;
        }
        intBitPosition -= interlaceInterval;
        outputBitPos--;
    } 
    return outputValue;
}