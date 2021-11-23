private int calculateMaximumCoordinate(int originalPoint, int delta) {
    if ((originalPoint < 0) || (originalPoint < ((java.lang.Integer.MAX_VALUE) - delta))) {
        return originalPoint - delta;
    }else {
        return java.lang.Integer.MIN_VALUE;
    }
}