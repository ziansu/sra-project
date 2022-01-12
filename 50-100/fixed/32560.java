private static java.util.HashSet<java.lang.Integer> getNonZeroArgs(java.util.HashMap<java.lang.Integer, java.lang.String> prediction, java.util.HashMap<java.lang.String, java.lang.Integer> reverseLabelMap) {
    java.util.HashSet<java.lang.Integer> nonZeroArgs = new java.util.HashSet();
    for (int key : prediction.keySet())
        if (!(prediction.get(key).equals(reverseLabelMap.get("0"))))
            nonZeroArgs.add(key);
        
    
    return nonZeroArgs;
}