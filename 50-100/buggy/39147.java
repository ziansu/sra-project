public java.util.Map<T, java.lang.Long> getCounts() {
    java.util.Map<T, java.lang.Long> result = new java.util.HashMap<T, java.lang.Long>();
    for (T obj : objToCounts.keySet()) {
        result.put(obj, computeTotalCount(obj));
    }
    return result;
}