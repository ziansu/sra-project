public static int getCountOfOne(int num) {
    int count = 0;
    while (num != 0) {
        if ((num & 1) == 1) {
            count++;
        }
        num >>>= 1;
    } 
    return count;
}