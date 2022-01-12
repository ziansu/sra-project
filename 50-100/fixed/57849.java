private void setMostCommonWord() {
    int currentMax = 0;
    java.util.Iterator it = wordMap.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        if (((java.lang.Integer) (pair.getValue())) > currentMax) {
            currentMax = ((java.lang.Integer) (pair.getValue()));
            mostCommonWord = pair.getKey().toString();
        }
    } 
}