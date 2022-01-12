public boolean setLength(double newLength) {
    boolean returnValue = false;
    if (newLength > 0) {
        this.length = newLength;
        returnValue = true;
    }else {
        this.length = Measurable.DEFAULT_SIDE;
    }
    return returnValue;
}