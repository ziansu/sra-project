private static int countProportionNumbers(int numInput) {
    int numInputSize = java.lang.String.valueOf(numInput).length();
    return numInputSize * (numInputSize - 1);
}