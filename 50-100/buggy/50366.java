public int rob(int[] num) {
    if ((num.length) == 0) {
        return 0;
    }
    int prevprev = 0;
    int prev = num[0];
    for (int i = 1; i < (num.length); i++) {
        int tmp = prev;
        prev = java.lang.Math.max(prev, java.lang.Math.max((prevprev + (num[i])), prev));
        prevprev = tmp;
    }
    return prev;
}