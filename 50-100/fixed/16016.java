public static java.lang.Integer lcm(int first, int second) {
    if ((((first == 0) || (first == 1)) || (second == 0)) || (second == 1))
        return 1;
    
    for (int i = 2; (i <= first) && (i <= second); i++) {
        if (((first % i) == 0) && ((second % i) == 0))
            return i;
        
    }
    return -1;
}