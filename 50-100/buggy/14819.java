public int getRenderIndexFromRealIdx(int realIdx) {
    if ((columnMapping) == null) {
        return realIdx;
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry : columnMapping.entrySet())
        if (entry.getValue().equals(realIdx))
            return entry.getKey();
        
    
    return realIdx;
}