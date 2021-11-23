public void modifyOdds(combatSystem.CombatObj combat) {
    if ((combat.isWithEngineer()) && (combat.isCloseAssault())) {
        moveOddsUp();
    }
    if (combat.isOverRun()) {
        moveOddsUp();
    }
}