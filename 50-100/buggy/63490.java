private boolean checkIfThirdWordExists(java.lang.String keyWord, java.lang.String secondWord, java.lang.String thirdWord, java.util.TreeMap<java.lang.String, java.util.TreeMap<java.lang.String, java.lang.Double>> existingSecondWordEntries) {
    existingThirdWordEntries = existingSecondWordEntries.get(secondWord);
    if (existingThirdWordEntries.containsKey(thirdWord)) {
        incrementCount(existingSecondWordEntries, existingThirdWordEntries, keyWord, secondWord, thirdWord);
        return true;
    }else
        java.lang.System.out.println(((((("existing skipgram not found for: " + keyWord) + " ") + secondWord) + " ") + thirdWord));
    
    return false;
}