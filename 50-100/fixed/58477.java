public java.lang.Character mostFrequent(java.lang.String s) {
    int maxValueInTheMap = java.util.Collections.max(map.values());
    for (java.util.Map.Entry<java.lang.Character, java.lang.Integer> entry : map.entrySet())
        if ((entry.getValue()) == maxValueInTheMap) {
            return entry.getKey();
        }
    
    return entry.getKey();
}