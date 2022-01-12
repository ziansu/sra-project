private int loBound(int lowRef, int[] inputArray, int bRef) {
    int tmpLo = search(lowRef, inputArray, 0, bRef);
    if ((inputArray[tmpLo]) < lowRef) {
        tmpLo++;
    }else
        if (((inputArray[tmpLo]) == lowRef) && (tmpLo > 0)) {
            tmpLo--;
        }
    
    return tmpLo;
}