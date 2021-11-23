public void init(com.mojang.mojam.level.Level level, int x, int y) {
    this.level = level;
    this.x = x;
    this.y = y;
    if ((img) == (-1))
        img = TurnSynchronizer.synchedRandom.nextInt(4);
    
    minimapColor = com.mojang.mojam.screen.Art.floorTileColors[((img) & 7)][((img) / 8)];
}