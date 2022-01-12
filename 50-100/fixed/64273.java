public static int calculateLabel(java.lang.Double doubleValue) {
    int label = doubleValue.intValue();
    if (label >= 10) {
        label = 9;
    }else
        if (label <= (-10)) {
            label = -9;
        }
    
    return label + 9;
}