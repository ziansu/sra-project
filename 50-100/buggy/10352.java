private static int findLeftPivot(int[] array, int k) {
    if ((array.length) > 0) {
        if (k == 0)
            return -1;
        else {
            int i = project2.NonInitiator.randRange(0, k);
            return array[i];
        }
    }else
        return -1;
    
}