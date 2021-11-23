private int loBound(int lowRef, int[] inputArray, int bRef) {
    int tmpLo = search(low, inputArray, 0, bRef);
    if ((inputArray[tmpLo]) <= (low)) {
        tmpLo++;
    }
    return tmpLo;
}