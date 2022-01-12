public java.util.HashMap<java.lang.Double, java.lang.String> closest(int k, java.util.ArrayList<java.lang.Double> distanceList, java.util.HashMap<java.lang.Double, java.lang.String> distances) {
    java.util.HashMap<java.lang.Double, java.lang.String> result = new java.util.HashMap<java.lang.Double, java.lang.String>();
    int i = 0;
    while (i < k) {
        result.put(distanceList.get(i), distances.get(i));
        i++;
    } 
    return result;
}