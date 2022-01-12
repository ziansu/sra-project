public void nextShip() {
    (shipIndex)++;
    if ((shipList.size()) <= (shipIndex)) {
        shipIndex = 0;
    }
    org.openRealmOfStars.player.combat.CombatShip ship = getCurrentShip();
    ship.reInitShipForRound();
}