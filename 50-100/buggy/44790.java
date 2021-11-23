public static int findPeak(int[] A, int left, int right) {
    if (left == right)
        return left;
    
    int mid = left + ((right - left) / 2);
    if ((A[mid]) > (A[(mid + 1)]))
        return medium.FindPeakElement.findPeak(A, left, mid);
    else
        return medium.FindPeakElement.findPeak(A, (mid + 1), right);
    
}