public org.psnbtech.tetris.TileMatrix rotated(int rotations) {
    if (rotations == 0)
        return rotated();
    else
        return rotated().rotated((rotations - 1));
    
}