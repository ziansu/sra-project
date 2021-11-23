private int partition(int pivot, int start, int end) {
    int pValue = array[pivot];
    int i = start + 1;
    int j = start + 1;
    while (j < end) {
        if (pValue > (array[j])) {
            swap(i, j);
            i++;
        }
        j++;
    } 
    swap(pivot, (i - 1));
    return i - 1;
}