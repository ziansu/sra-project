public static boolean areSameIntArrays(int[] array1, int[] array2) {
    int idx = 0;
    while ((idx < (array1.length)) && ((array1[idx]) == (array2[idx]))) {
        idx++;
    } 
    if (idx < (array1.length)) {
        return false;
    }else {
        return true;
    }
}