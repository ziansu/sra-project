private java.lang.String addSign(double d) {
    d = d - (2 * d);
    if (d >= 0) {
        return "+" + d;
    }else {
        return java.lang.String.valueOf(d);
    }
}