int binarySearch(int[] a, int x) {
    int n = a.length;
    int lower;
    int upper;
    int middle;
    lower = 0;
    upper = n - 1;
    while (lower <= upper) {
        middle = (lower + upper) / 2;
        if (x > (a[middle]))
            lower = middle + 1;
        else
            if (x < (a[middle]))
                upper = middle - 1;
            else
                return middle;
            
        
    } 
    return -1;
}