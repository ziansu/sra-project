public int floorShiftAmount() {
    for (int i = 0; i < (Grid.HEIGHT); i++) {
        if ((((row) + i) == (Grid.HEIGHT)) || (grid.isSet(((row) + i), col))) {
            return i;
        }
    }
    return 0;
}