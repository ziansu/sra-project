private static java.lang.String getFractionToString(double itemPrice, int digits) {
    double fractionalPart = (itemPrice % 1) * 100;
    long intFraction = ((long) (fractionalPart));
    java.lang.String stringFraction = ve.com.soted.softparkmulti.components.TfhkaPrinter.fillWithZeros(intFraction, digits);
    return stringFraction;
}