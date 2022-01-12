private void addNewSecondValue(java.lang.String key, java.lang.String secondWord, java.lang.String thirdWord) {
    existingSecondWordEntries = skipTrigramCounts.get(key);
    java.util.TreeMap<java.lang.String, java.lang.Double> newThirdWordEntry = new java.util.TreeMap<java.lang.String, java.lang.Double>();
    newThirdWordEntry.put(thirdWord, 1.0);
    existingSecondWordEntries.put(secondWord, newThirdWordEntry);
    skipTrigramCounts.put(key, existingSecondWordEntries);
}