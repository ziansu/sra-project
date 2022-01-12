public int solution(int[] A) {
    int expectedSum = (((A.length) + 1) * ((A.length) + 2)) / 2;
    int realSum = 0;
    for (int i : A) {
        realSum += i;
    }
    return expectedSum - realSum;
}