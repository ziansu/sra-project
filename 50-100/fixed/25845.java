public static <K> java.util.Map<K, java.lang.Double> normalize(java.util.Map<K, java.lang.Double> map) {
    double z = 0.0;
    for (java.lang.Double d : map.values())
        z += d;
    
    if (z == 0)
        return map;
    
    for (java.util.Map.Entry<K, java.lang.Double> e : map.entrySet())
        e.setValue(((e.getValue()) / z));
    
    return map;
}