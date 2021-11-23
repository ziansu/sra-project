private static double Norm(java.util.Map<java.lang.Integer, java.lang.Double> weights) {
    double res = 0;
    for (double v : weights.values()) {
        res += v * v;
    }
    res = java.lang.Math.sqrt(res);
    return res;
}