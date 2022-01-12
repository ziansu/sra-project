public boolean isBarrierDown() {
    for (int i = 0; i < (size); i++) {
        int x = getBlockCoordinateX(i);
        int y = getBlockCoordinateY(i);
        if ((y < 0) || (x < 1))
            continue;
        
        if (y >= (Main.field.getRows()))
            return true;
        
        if (Main.field.getIsFullBlock()[y][(x - 1)])
            return true;
        
    }
    return false;
}