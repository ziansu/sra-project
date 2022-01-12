private int interlaceToInteger(int inputValue, int inputBitPosition, int integerValue, int integerBitPosition, int interlaceInterval) {
    while ((integerBitPosition > (-1)) && (inputBitPosition > (-1))) {
        integerValue += inputValue & ((com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << inputBitPosition);
        integerBitPosition -= interlaceInterval;
        inputBitPosition--;
    } 
    return integerValue;
}