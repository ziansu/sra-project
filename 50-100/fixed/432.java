private void shift(boolean vert, boolean down) {
    if (vert) {
        if (down) {
            ys[0] -= SHIFT;
            ys[1] -= SHIFT;
        }else {
            ys[0] += SHIFT;
            ys[1] += SHIFT;
        }
    }else {
        if (down) {
            xs[0] -= SHIFT;
            xs[1] -= SHIFT;
        }else {
            xs[0] += SHIFT;
            xs[1] -= SHIFT;
        }
    }
}