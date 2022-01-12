private boolean hasOverlap(long startDate, long endDate, long anotherStartDate, long anotherEndDate) {
    if (startDate >= endDate) {
        throw new java.lang.IllegalArgumentException("startDate must be less than endDate");
    }
    if (anotherStartDate >= anotherEndDate) {
        throw new java.lang.IllegalArgumentException("anotherStartDate must be less than anotherEndDate");
    }
    if ((startDate <= anotherStartDate) && (anotherStartDate < endDate)) {
        return true;
    }
    if ((startDate < anotherEndDate) && (anotherEndDate <= endDate)) {
        return true;
    }
    return false;
}