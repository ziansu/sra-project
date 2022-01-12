public int solution(int[] A) {
    int N = (A.length) + 1;
    java.lang.Integer partialSum = (N * (N + 1)) / 2;
    java.lang.Integer actualSum = 0;
    for (int i = 0; i < (A.length); i++) {
        actualSum += A[i];
    }
    java.lang.Integer missingNumber = partialSum - actualSum;
    return missingNumber.intValue();
}