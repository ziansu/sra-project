boolean compareArray(int[] A, int[] B) {
    if ((A.length) != (B.length)) {
        return false;
    }
    for (int i = 0; i < (A.length); i++) {
        if ((A[i]) != (B[i])) {
            return false;
        }
    }
    return true;
}