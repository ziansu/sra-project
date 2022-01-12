public static boolean isNumUnique(int currentNum, int currentIntCount, int[] currentIntList) {
    boolean newUnique = false;
    for (int j = 0; j < currentIntCount; j++) {
        if ((currentIntList[j]) == currentNum) {
            newUnique = false;
        }
        if (j == (currentIntCount - 1)) {
            newUnique = true;
        }
    }
    if (newUnique) {
        return true;
    }else {
        return false;
    }
}