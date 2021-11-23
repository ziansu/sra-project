private void addNewSecondValue(java.lang.String key, java.lang.String secondWord, java.lang.String thirdWord) {
    java.lang.System.out.println(key);
    java.lang.System.out.println(secondWord);
    java.lang.System.out.println(thirdWord);
    existingSecondWordEntries = skipTrigramCounts.get(key);
    java.util.TreeMap<java.lang.String, java.lang.Double> newThirdWordEntry = new java.util.TreeMap<java.lang.String, java.lang.Double>();
    newThirdWordEntry.put(thirdWord, 1.0);
    existingSecondWordEntries.put(secondWord, newThirdWordEntry);
    skipTrigramCounts.put(key, existingSecondWordEntries);
    java.lang.System.out.println(((skipTrigramCounts) + " all skip-trigrams after adding new second word"));
}