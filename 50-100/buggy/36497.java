public int firstBadVersion(int n) {
    if (isBadVersion(1)) {
        return start;
    }
    int start = 1;
    int end = n;
    while (start < (end - 1)) {
        int mid = start + ((end - start) / 2);
        if (isBadVersion(mid)) {
            end = mid;
        }else {
            start = mid;
        }
    } 
    return end;
}