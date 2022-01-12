public boolean CompareSelection(int x, int y) {
    for (int i = 0; i < (MineCoordinates.length); i++) {
        if (CompareCoordinates(x, y, MineCoordinates[i])) {
            return true;
        }
    }
    return false;
}