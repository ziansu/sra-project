public int solution(int[] A) {
    int N = (A.length) + 1;
    long partialSum = (N * (N + 1)) / 2;
    long actualSum = 0;
    for (int i = 0; i < (A.length); i++) {
        actualSum += A[i];
    }
    int missingNumber = ((int) (partialSum - actualSum));
    return missingNumber;
}