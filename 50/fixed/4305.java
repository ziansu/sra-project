private static int numberOfBitsNeededForPositiveLong(long positiveValue) {
    if (positiveValue == 0)
        return 1;
    
    return 64 - (java.lang.Long.numberOfLeadingZeros(positiveValue));
}