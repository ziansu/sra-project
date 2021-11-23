public static java.lang.Integer gcm(int first, int second) {
    int i = (first >= second) ? first : second;
    while (i != 0) {
        if (((first % i) == 0) && ((second % i) == 0))
            return i;
        
        i--;
    } 
    return -1;
}