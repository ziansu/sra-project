private static java.lang.String getFractionToString(double itemPrice, int digits) {
    double fractionalPart = (itemPrice % 1) * 100;
    int intFraction = java.lang.Integer.parseInt(java.lang.String.valueOf(fractionalPart));
    java.lang.String stringFraction = ve.com.soted.softparkmulti.components.TfhkaPrinter.fillWithZeros(intFraction, digits);
    return stringFraction;
}