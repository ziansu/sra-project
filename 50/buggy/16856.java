void loseLevel(int dmg) {
    if ((this.level) != 90) {
        this.level -= dmg;
        updateCombatLevel();
    }
}