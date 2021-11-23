public int countMatch(int a, int b) {
    if ((a <= 0) && (b <= 0))
        return 0;
    else {
        if ((a % 10) == (b % 10))
            return 1 + (countMatch((a / 10), (b / 10)));
        
    }
    return 0;
}