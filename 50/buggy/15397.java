@java.lang.Override
public java.lang.Double divide(double input1, double input2) {
    int temp = java.lang.Double.compare(input2, 0.0);
    if (temp != 0) {
        double x = input1 / input2;
        return x;
    }else {
        return java.lang.Double.POSITIVE_INFINITY;
    }
}