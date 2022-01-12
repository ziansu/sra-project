public float avg() {
    long sum = 0;
    java.lang.Long[] iheap = history.toArray(new java.lang.Long[0]);
    for (java.lang.Long lz : iheap)
        sum += lz;
    
    return ((float) (sum)) / ((float) (history.size()));
}