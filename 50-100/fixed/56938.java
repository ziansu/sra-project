java.util.ArrayList<java.lang.Integer> calculateValues(int min, int max, int step) {
    java.util.ArrayList<java.lang.Integer> result = new java.util.ArrayList<>();
    int pos = min;
    while (pos <= max) {
        result.add(pos);
        pos += step;
    } 
    if ((result.get(((result.size()) - 1))) < max)
        result.add(pos);
    
    return result;
}