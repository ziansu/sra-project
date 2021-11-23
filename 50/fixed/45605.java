public nl.tudelft.jpacman.Level nextLevel() {
    nl.tudelft.jpacman.Level level = makeLevel((++(currentLevel)));
    if (level == null) {
        level = makeLevel((--(currentLevel)));
    }
    level.setIndex(currentLevel);
    return level;
}