private static double Norm(java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Double> weights) {
    double res = 0;
    java.util.Enumeration<java.lang.Double> values = weights.elements();
    while (values.hasMoreElements()) {
        double v = values.nextElement();
        res += v * v;
    } 
    res = java.lang.Math.sqrt(res);
    return res;
}