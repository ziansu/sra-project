private int hiBound(int hiRef, int[] inputArray, int bRef) {
    int tmpHi = search(hiRef, inputArray, bRef, ((inputArray.length) - 1));
    if ((inputArray[tmpHi]) > hiRef) {
        tmpHi--;
    }else
        if (((inputArray[tmpHi]) == hiRef) && (tmpHi < ((inputArray.length) - 1))) {
            tmpHi++;
        }
    
    return tmpHi;
}