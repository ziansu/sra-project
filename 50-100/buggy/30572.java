public void add(double value) {
    if (((min) == (java.lang.Double.NEGATIVE_INFINITY)) || (value < (min))) {
        min = value;
    }
    if (((max) == (java.lang.Double.POSITIVE_INFINITY)) || (value > (max))) {
        max = value;
    }
}