public void constructCharFreqs() {
    java.util.ArrayList<java.lang.Character> charKeys = new java.util.ArrayList<>(characterFrequencies.keySet());
    java.util.Collections.sort(charKeys);
    for (java.lang.Character charKey : charKeys) {
        charFreqs.add(new healthdatacompressionmodule.CharFreq(charKey, characterFrequencies.get(charKey)));
    }
}