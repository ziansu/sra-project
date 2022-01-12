public boolean isBarrierRight() {
    for (int i = 0; i < (size); i++) {
        int x = getBlockCoordinateX(i);
        int y = getBlockCoordinateY(i);
        if (x >= (Main.field.getColumns()))
            return true;
        
        if (y < 1)
            continue;
        
        if (Main.field.getIsFullBlock()[(y - 1)][x])
            return true;
        
    }
    return false;
}