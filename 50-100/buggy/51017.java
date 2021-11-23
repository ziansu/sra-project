public static boolean areSameIntArrays(int[] array1, int[] array2) {
    int idx = 0;
    while ((idx < (array1.length)) && ((array1[idx]) == (array2[idx]))) {
        idx++;
        java.lang.System.out.println(("idx" + idx));
    } 
    if (idx <= (array1.length)) {
        return true;
    }else {
        return false;
    }
}