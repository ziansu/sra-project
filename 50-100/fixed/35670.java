private void addNewEntry(java.lang.String key, java.lang.String secondWord, java.lang.String thirdWord) {
    java.util.TreeMap<java.lang.String, java.util.TreeMap<java.lang.String, java.lang.Double>> newSecondWordEntry = new java.util.TreeMap<java.lang.String, java.util.TreeMap<java.lang.String, java.lang.Double>>();
    java.util.TreeMap<java.lang.String, java.lang.Double> newThirdWordEntry = new java.util.TreeMap<java.lang.String, java.lang.Double>();
    newThirdWordEntry.put(thirdWord, 1.0);
    newSecondWordEntry.put(secondWord, newThirdWordEntry);
    skipTrigramCounts.put(key, newSecondWordEntry);
}