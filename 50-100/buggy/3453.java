public final boolean isPartiallyEmpty(int x, int y1, int y2, int z) {
    for (int y = y1; y < y2; y++) {
        if (isType(x, y, z, Material.AIR))
            return true;
        
    }
    return false;
}