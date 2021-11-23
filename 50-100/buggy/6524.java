public static boolean pointBetween(double d1, double d2, double d3) {
    boolean compare = d1 > d2;
    double low = (compare) ? d1 : d2;
    double high = (compare) ? d2 : d1;
    return (d3 >= low) && (d3 <= high);
}