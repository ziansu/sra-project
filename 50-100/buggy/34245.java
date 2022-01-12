protected void generateLevel() {
    for (int y = 0; y < (height); y++) {
        for (int x = 0; x < (height); x++) {
            tiles[(x + (y * (width)))] = com.thedude.rain.level.RandomLevel.random.nextInt(4);
        }
    }
}