public static double mapMeanValue(java.util.Map<java.lang.String, java.lang.Integer> map) {
    double mean = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
        mean = mean + (entry.getValue().doubleValue());
    }
    return mean / (map.size());
}