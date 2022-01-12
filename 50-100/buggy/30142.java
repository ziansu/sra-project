public void modify(nl.tudelft.scrumbledore.level.Level level, double delta) {
    detectPlayerBubble(level, delta);
    detectFruitPlatform(level, delta);
    detectBubblePlatform(level, delta);
    detectPlayerPlatform(level, delta);
    detectPlayerFruit(level, delta);
    detectPlayerEnemy(level, delta);
    detectBubbleEnemy(level, delta);
    detectBubbleBubble(level, delta);
    detectNPCPlatform(level, delta);
}