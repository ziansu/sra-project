void loseLevel(int dmg) {
    if ((this.level) != 0) {
        this.level -= dmg;
        updateCombatLevel();
    }
}