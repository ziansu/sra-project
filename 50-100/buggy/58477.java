public java.lang.Character mostFrequent(java.lang.String s) {
    int maxValueInTheMap = java.util.Collections.max(map.values());
    for (java.util.Map.Entry<java.lang.Character, java.lang.Integer> entry : map.entrySet())
        if ((entry.getValue()) == maxValueInTheMap) {
            java.lang.System.out.println(entry.getValue());
            java.lang.System.out.println(entry.getKey());
            return entry.getKey();
        }
    
    return entry.getKey();
}