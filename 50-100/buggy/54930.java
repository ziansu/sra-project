public boolean contains(int value, int[] intArray) {
    for (int i = 0; i < (intArray.length); i++) {
        if ((intArray[i]) == value) {
            return true;
        }
    }
    return false;
}