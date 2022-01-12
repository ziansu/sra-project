public java.lang.String searchRainbowtable(java.util.Map<java.lang.String, java.lang.String> rainbowTable, java.lang.String hash, int amountOfCycles) {
    java.lang.String possibleMatch = reduceFromMD5Hash(new java.math.BigInteger(hash, 16), amountOfCycles);
    if (rainbowTable.containsKey(possibleMatch)) {
        return rainbowTable.get(possibleMatch);
    }
    for (int i = amountOfCycles; i >= 0; i--) {
        possibleMatch = reduceFromMD5Hash(new java.math.BigInteger(hash, 16), i);
    }
    return "";
}