private void setMostCommonWord() {
    int currentMax = 0;
    java.lang.String currentMaxKey = "";
    java.util.Iterator it = wordMap.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        if (((java.lang.Integer) (pair.getValue())) > currentMax)
            mostCommonWord = pair.getKey().toString();
        
    } 
}