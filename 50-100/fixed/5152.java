public static java.lang.String convertToStringFromBaseN(java.util.Queue<java.lang.String> digitsList, short baseNumber) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    int convertedAscIIValue = 0;
    for (java.lang.String digits : digitsList) {
        convertedAscIIValue = com.sample.util.Util.getConvertedAsciiValue(digits, baseNumber);
        builder.append(((char) (convertedAscIIValue)));
    }
    return builder.toString();
}