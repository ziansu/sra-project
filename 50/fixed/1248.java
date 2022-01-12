public int length() {
    return (hasLowerBound()) && (hasUpperBound()) ? ((rangeTo) - (rangeFrom)) + 1 : -1;
}