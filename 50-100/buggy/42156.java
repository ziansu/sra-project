private int getPosition(int i, int j) {
    if (i < 0) {
        return 0;
    }else
        if (i >= (n)) {
            return (totalNodes) - 1;
        }
    
    return (((n) * i) + j) + 1;
}