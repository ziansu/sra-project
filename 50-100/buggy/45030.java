public void removePoint(float value, int cls) {
    histogram.remove(value, cls);
    (cd[cls])--;
    (label)--;
    if (value == (end)) {
        java.util.NavigableSet<java.lang.Float> keyset = ((java.util.NavigableSet<java.lang.Float>) (histogram.keySet()));
        java.lang.Float nend = keyset.floor(value);
        if (nend != null)
            end = nend;
        else
            end = -1;
        
    }
}