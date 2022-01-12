public static double mapMeanValue(java.util.Map<java.lang.String, java.lang.Integer> map) {
    int mean = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
        mean = mean + (entry.getValue());
    }
    return ((double) (mean)) / (map.size());
}