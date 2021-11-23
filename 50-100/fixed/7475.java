public static double[] rexp(int count, double lambda) {
    double[] result = new double[count];
    double current = 0;
    for (int i = 0; i < count; i++) {
        current = ((-1) / lambda) * (java.lang.Math.log((1 - (java.lang.Math.random()))));
        result[i] = current;
    }
    return result;
}