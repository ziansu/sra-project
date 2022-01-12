public boolean isBarrierRight() {
    for (int i = 0; i < (size); i++) {
        int x = getBlockCoordinateX(i);
        int y = getBlockCoordinateY(i);
        if (x < 0)
            continue;
        
        if (y < 1)
            continue;
        
        if (x >= (Main.field.getColumns()))
            return true;
        
        if (Main.field.getIsFullBlock()[(y - 1)][x])
            return true;
        
    }
    return false;
}