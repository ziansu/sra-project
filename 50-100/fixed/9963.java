private void moveBy(double move) {
    nextx = (x) + ((dir[0]) * move);
    nexty = (y) + ((dir[1]) * move);
    intx = ((int) (nextx));
    inty = ((int) (nexty));
    if ((nextx) < 0)
        (intx)--;
    
    if ((nexty) < 0)
        (inty)--;
    
}