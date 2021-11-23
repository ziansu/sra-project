void loseLevel(int dmg) {
    for (int i = 0; i < dmg; i++) {
        if ((this.level) > 0) {
            this.level -= i;
        }
    }
    updateCombatLevel();
}