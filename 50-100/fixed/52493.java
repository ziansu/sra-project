public int solution(int M, int N) {
    if ((M == 0) || (N == 0)) {
        return 0;
    }
    if (M == N) {
        return M;
    }
    int bitwise = 1;
    int delta = 1;
    while (delta <= M) {
        delta = delta << 1;
        if (delta <= M) {
            bitwise = bitwise << 1;
        }
    } 
    return bitwise;
}