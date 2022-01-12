private int hiBound(int hiRef, int[] inputArray, int bRef) {
    int tmpHi = search(hi, inputArray, bRef, ((inputArray.length) - 1));
    if ((inputArray[tmpHi]) > (hi)) {
        tmpHi--;
    }
    return tmpHi;
}