private int getPosition(int i, int j) {
    if (i < 1) {
        return 0;
    }else
        if (i > (n)) {
            return (totalNodes) - 1;
        }
    
    return (((n) * (i - 1)) + (j - 1)) + 1;
}