int increaseCapacity(int expectedCapacity) {
    maxCapacity = java.lang.Math.min(expectedCapacity, maxCapacity);
    return maxCapacity;
}