private void sink(int k, int length) {
    while ((2 * k) <= length) {
        int j = 2 * k;
        if (less(j, (j + 1)))
            j++;
        
        if (!(less(k, j)))
            break;
        
        exch(k, j);
        k = j;
    } 
}