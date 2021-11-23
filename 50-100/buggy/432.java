private void shift(boolean vert, boolean down) {
    if (vert) {
        if (down) {
            ys -= SHIFT;
        }else
            ys += SHIFT;
        
    }else {
        if (down) {
            xs -= SHIFT;
        }else
            xs += SHIFT;
        
    }
}