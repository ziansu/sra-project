public int randomColor(int c1, int c2) {
    if ((random(0, 1)) > 0.5F) {
        return c1;
    }else
        if ((random(0, 1)) < 0.5F) {
            return c2;
        }
    
    return 0;
}