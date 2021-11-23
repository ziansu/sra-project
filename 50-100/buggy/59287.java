private int rankPasses(java.util.HashMap<java.lang.String, java.lang.Boolean> criteria) {
    int passes = 0;
    java.util.Iterator it = criteria.entrySet().iterator();
    while (it.hasNext()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (it.next()));
        if (((java.lang.Boolean) (pair.getValue()))) {
            passes++;
        }
    } 
    return passes;
}