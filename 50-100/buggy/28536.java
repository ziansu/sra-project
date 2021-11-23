public double Mean(java.util.ArrayList<java.lang.Long> l) {
    if ((l.size()) <= 0)
        return 0;
    
    java.lang.Long sum = java.lang.Long.valueOf(0);
    for (java.lang.Long val : l) {
        sum += val;
    }
    return sum / (l.size());
}