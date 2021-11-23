public int attackPicker(java.lang.String moveName) {
    for (int i = 0; i < (attacksNames.length); i++) {
        if (moveName.equals(attacksNames[i])) {
            this.changeEnergy((-(this.attackEnergyCosts[i])));
            return attackMultipliers[i];
        }
    }
    return 0;
}