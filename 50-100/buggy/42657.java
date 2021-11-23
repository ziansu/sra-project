protected boolean twisterHitTest(int x, int y) {
    if ((hasTwister()) == 0)
        return false;
    
    return (((x >= 0) && (x < (U2Px(12)))) && (y >= 0)) && (y < (U2Px(12)));
}