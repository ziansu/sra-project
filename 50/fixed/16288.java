public org.psnbtech.tetris.TileMatrix rotated(int rotations) {
    if (rotations == 0)
        return this;
    else
        return rotated().rotated((rotations - 1));
    
}