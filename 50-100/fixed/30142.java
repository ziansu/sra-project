public void modify(nl.tudelft.scrumbledore.level.Level level, double delta) {
    detectPlayerBubble(level, delta);
    detectBubbleEnemy(level, delta);
    detectBubbleBubble(level, delta);
    detectFruitPlatform(level, delta);
    detectBubblePlatform(level, delta);
    detectPlayerPlatform(level, delta);
    detectPlayerFruit(level, delta);
    detectPlayerEnemy(level, delta);
    detectNPCPlatform(level, delta);
}