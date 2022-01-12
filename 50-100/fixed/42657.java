protected boolean twisterHitTest(int x, int y) {
    return (((((hasTwister()) != 0) && (x >= 0)) && (x < (U2Px(12)))) && (y >= 0)) && (y < (U2Px(12)));
}