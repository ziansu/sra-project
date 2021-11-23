public void setLevel(int level) {
    this.level = level;
    this.maxHealth = 10 + (10 * (this.level));
}