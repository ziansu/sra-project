public void resolve() {
    if (getResult()) {
        attacker.moveArmies(defender.getID(), ((numAttackingArmies) - 1));
    }
}