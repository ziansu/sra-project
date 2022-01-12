@java.lang.Override
public double getCalibratedTimePoint(int t, int c, int z) {
    if ((timePointCZT) == null)
        initTimePointMap();
    
    if (timePointCZT.isEmpty())
        return java.lang.Double.NaN;
    
    java.lang.String key = getKey(c, z, t);
    java.lang.Double d = timePointCZT.get(key);
    if (d != null)
        return d;
    else
        return java.lang.Double.NaN;
    
}