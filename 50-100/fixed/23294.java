private void attackPhase() {
    attackerDriver.main(attackerList);
    playerHealth -= attackerDriver.endPathcheck(attackerList);
    if ((millis()) >= (reloadTime)) {
        towerDriver.hitDetection(attackerList);
        reloadTime = (millis()) + (towerFireDelay);
        playerScore += towerDriver.income(attackerList);
    }
    if (attackerList.isEmpty()) {
        gameDriver.phase = "endWave";
    }
}