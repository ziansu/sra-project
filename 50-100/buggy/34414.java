private static java.lang.String getFormat(int integerDigits, int fractionDigits, int maxFractionDigits) {
    int width = (integerDigits + (fractionDigits > 0 ? 1 : 0)) + fractionDigits;
    int padding = (maxFractionDigits - fractionDigits) + (fractionDigits == 0 ? 1 : 0);
    return (((("%" + width) + ".") + fractionDigits) + "f") + (repeat(' ', padding));
}