private static int findRightPivot(int[] array, int k) {
    int i = -1;
    if ((array.length) > 0)
        if (k != (array.length)) {
            i = project2.NonInitiator.randRange(k, array.length);
            i = array[i];
        }
    
    return i;
}