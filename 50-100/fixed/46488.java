private int interlaceToInteger(int inputValue, int inputBitPosition, int integerValue, int integerBitPosition, int interlaceInterval) {
    while ((integerBitPosition > (-1)) && (inputBitPosition > (-1))) {
        if ((inputValue & ((com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << inputBitPosition)) != 0) {
            integerValue += (com.browseengine.bobo.geosearch.impl.GeoConverter.ONE_AS_INT) << integerBitPosition;
        }
        integerBitPosition -= interlaceInterval;
        inputBitPosition--;
    } 
    return integerValue;
}