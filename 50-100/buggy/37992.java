private int powerOfTwo(int n) {
    int result = 0;
    while ((n % 2) == 0) {
        result++;
        n /= 2;
    } 
    if (n != 1) {
        return -1;
    }else {
        return result;
    }
}