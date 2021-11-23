public void handleFullGrid() {
    for (int i = 0; i < (NUMBER_OF_COLORS); i++) {
        if ((numBlock[i]) >= 100) {
            upgradeBlocks(i);
        }
    }
}