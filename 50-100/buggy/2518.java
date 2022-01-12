protected static int search(int[] array, int pivot) {
    int result = java.util.Arrays.binarySearch(array, pivot);
    if (result == (-1))
        return 0;
    else
        if (result > 0)
            return result;
        else {
            return (java.lang.Math.abs(result)) - 2;
        }
    
}