public static double round(double d, int decimal_place) {
    int a = ((int) (java.lang.Math.pow(10, decimal_place)));
    int i = ((int) ((java.lang.Math.round(d)) * a));
    return ((double) (i)) / a;
}