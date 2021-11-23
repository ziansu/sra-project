private int powerOfTwo(int n) {
    if (n <= 0) {
        return -1;
    }
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