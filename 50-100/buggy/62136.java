private int removeFromDictionary(java.util.TreeSet<java.util.Map.Entry<java.lang.String, java.lang.Integer>> dictionary, java.lang.String text) {
    int freqCount = 0;
    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> iterator = logic.Execution.taskDictionary.iterator();
    while (iterator.hasNext()) {
        java.util.Map.Entry<java.lang.String, java.lang.Integer> next = iterator.next();
        if (next.getKey().equals(text)) {
            freqCount = next.getValue();
            iterator.remove();
            break;
        }
    } 
    return freqCount;
}