public int value(int[][] hPole, int hX, int hY, int hrac) {
    v = 0;
    natahu = logic.natahu;
    if (logic.vzniknePetka(hX, hY, (hrac * (natahu)), hPole)) {
        v = hrac * 1000000;
        return v;
    }
    hPole[hX][hY] = hrac;
    v = projdiVsechnySestice(hPole, hrac);
    return v;
}