public java.util.SortedMap<java.lang.Long, java.lang.Double> getDataClassify() {
    if ((classifyData) != null) {
        return classifyData;
    }
    long i = 0L;
    classifyData = new java.util.TreeMap<java.lang.Long, java.lang.Double>();
    for (java.util.Map.Entry<java.lang.Long, java.lang.Double> kv : data.entrySet()) {
        i++;
        if (i <= (classifyDataPointsStart)) {
            continue;
        }
        classifyData.put(kv.getKey(), kv.getValue());
    }
    return classifyData;
}