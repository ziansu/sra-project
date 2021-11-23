public boolean isBarrierLeft() {
    for (int i = 0; i < (size); i++) {
        int x = getBlockCoordinateX(i);
        int y = getBlockCoordinateY(i);
        if (y < 1)
            continue;
        
        if (x <= 1)
            return true;
        
        if (Main.field.getIsFullBlock()[(y - 1)][(x - 2)])
            return true;
        
    }
    return false;
}