public int length() {
    return (!(hasLowerBound())) && (!(hasUpperBound())) ? (rangeFrom) - (rangeTo) : -1;
}