public void lowerHp(double x) {
    hp -= x;
    if ((hp) < 0) {
        hp = 0;
    }
}