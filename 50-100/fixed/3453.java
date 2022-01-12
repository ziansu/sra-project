public final boolean isPartiallyEmpty(int x, int y1, int y2, int z) {
    for (int y = y1; y < y2; y++) {
        if (isEmpty(x, y, z))
            return true;
        
    }
    return false;
}