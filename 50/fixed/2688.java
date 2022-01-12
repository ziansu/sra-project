public void handleFullGrid() {
    for (int i = NUMBER_OF_COLORS; i > 0; i--) {
        if ((numBlock[(i - 1)]) >= 100) {
            upgradeBlocks((i - 1));
        }
    }
}