private void addTwoDivisorsToArray(int number, int[] factors, int nextFreePosition, int divisor) {
    factors[nextFreePosition] = divisor;
    if (divisor != (number / divisor))
        factors[(nextFreePosition + 1)] = number / divisor;
    
}