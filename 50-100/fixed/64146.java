public int findPeakElement(int[] num) {
    int left = 0;
    int right = (num.length) - 1;
    while (left < right) {
        int mid = (left + right) / 2;
        if ((num[mid]) < (num[(mid + 1)]))
            left = mid + 1;
        else
            right = mid;
        
    } 
    return left;
}