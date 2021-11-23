public int solution(int[] A) {
    long expectedSum = (((A.length) + 1) * ((A.length) + 2)) / 2;
    long realSum = 0;
    for (int i : A) {
        realSum = realSum + (new java.lang.Long(i));
    }
    return new java.lang.Long((expectedSum - realSum)).intValue();
}