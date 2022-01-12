public final boolean isPartiallyEmpty(int x1, int x2, int y1, int y2, int z1, int z2) {
    for (int x = x1; x < x2; x++) {
        for (int y = y1; y < y2; y++) {
            for (int z = z1; z < z2; z++) {
                if (isType(x, y, z, Material.AIR))
                    return true;
                
            }
        }
    }
    return false;
}