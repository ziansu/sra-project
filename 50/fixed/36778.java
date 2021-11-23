private double average(java.util.ArrayList<java.lang.Double> al) {
    double total = 0;
    for (double d : al) {
        total = total + d;
    }
    return total / ((double) (al.size()));
}