private void resetCulture() {
    for (int i = 0; i < (maxX); i++) {
        for (int j = 0; j < (maxY); j++) {
            culture[i][j].reset();
        }
    }
}