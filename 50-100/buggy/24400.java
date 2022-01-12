public dnd.api.FightReport nextAttack() {
    double dealtDamage = dmgCalculator.calcDamage(currentAttacker.getExperience(), currentAttacker.getWeapon().getDamage());
    boolean defenderDied = this.currentAttacker.takeHit(dealtDamage);
    dnd.api.FightReport fightReport = new dnd.core.FightReportImpl(this.currentAttacker, this.currentDefender, dealtDamage, defenderDied);
    switchCurrentAttacker();
    return fightReport;
}