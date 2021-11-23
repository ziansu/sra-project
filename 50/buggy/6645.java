private boolean isLevelCountValid(int levelCount) {
    return ((this.levelMaxCount) > 0) && (levelCount < (this.levelMaxCount));
}