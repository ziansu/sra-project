private java.util.ArrayList<java.lang.Integer> digits(int i) {
    java.util.ArrayList<java.lang.Integer> digits = new java.util.ArrayList<java.lang.Integer>();
    int j = 0;
    while (i > 0) {
        digits.add((i % 10));
        i /= 10;
        j++;
    } 
    if (j == 1) {
        digits.add(0);
    }
    return digits;
}