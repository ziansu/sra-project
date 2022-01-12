public void initializeRandom() {
    initControllers();
    for (int row = 0; row < (width); row++) {
        for (int col = 0; col < (height); col++) {
            if ((random.nextDouble()) < (RANDOM_FILL_FACTOR)) {
                level[row][col] = getRandomCharFromLevelMapping();
            }else {
                level[row][col] = ' ';
            }
        }
    }
}