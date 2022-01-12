private boolean isOutOfBounds(int integer, int max) {
    return (isNegative(integer)) || (integer >= max);
}