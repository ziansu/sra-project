boolean compareArray(int[] A, int[] B) {
    if (((A.length) - 1) != ((B.length) - 1)) {
        return false;
    }
    for (int i = 0; i < ((A.length) - 1); i++) {
        if ((A[i]) != (B[i])) {
            return false;
        }
    }
    return true;
}