private static int countProportionNumbers(int numInput) {
    int numInputSize = java.lang.String.valueOf(numInput).length();
    return numInputSize == 1 ? numInputSize : numInputSize * (numInputSize - 1);
}