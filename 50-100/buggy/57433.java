public java.lang.String findFirst(java.lang.String textToSegment) {
    if ((textToSegment.length()) == 0)
        return null;
    
    java.util.List<java.lang.String> results = new java.util.ArrayList<>(2);
    java.util.LinkedList<java.lang.String> buffer = new java.util.LinkedList<>();
    split(textToSegment, 0, 1, buffer, results, false);
    if ((results.size()) == 1)
        return results.get(0);
    else
        return null;
    
}