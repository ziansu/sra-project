@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    if ((e.getWheelRotation()) < 0) {
        if ((TILE_SIZE) <= 120)
            adjustTileSize(((TILE_SIZE) + 8));
        
    }else {
        if ((TILE_SIZE) >= 24)
            adjustTileSize(((TILE_SIZE) - 8));
        
    }
}