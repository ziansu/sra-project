@java.lang.Override
public java.lang.Double divide(double input1, double input2) {
    int temp = java.lang.Double.compare(input2, 0.0);
    if (temp != 0) {
        return input1 / input2;
    }else {
        return java.lang.Double.POSITIVE_INFINITY;
    }
}