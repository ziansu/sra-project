public boolean CompareSelection() {
    MouseAdapter = new MyMouseAdapter();
    for (int i = 0; i < (MineCoordinates.length); i++) {
        if (CompareCoordinates(MouseAdapter.getCompareX(), MouseAdapter.getCompareY(), MineCoordinates[i])) {
            return true;
        }
    }
    return false;
}