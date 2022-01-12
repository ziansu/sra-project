public static java.lang.String getPrice(double value) {
    int intPrice = 0;
    if ((value == (java.lang.Math.floor(value))) && (!(java.lang.Double.isInfinite(value)))) {
        java.lang.Double doublePrice = new java.lang.Double(value);
        intPrice = doublePrice.intValue();
        return java.lang.Integer.toString(intPrice);
    }else {
        return java.lang.Double.toString(value);
    }
}