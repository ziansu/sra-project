public double setLabelSideLength(java.lang.String ciffers) {
    double screenLength = 400;
    if ((puzzleSize) <= 10) {
        return screenLength / (puzzleSize);
    }else {
        return ((ciffers.length()) * 5) + 20;
    }
}