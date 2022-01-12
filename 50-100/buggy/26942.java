@java.lang.Override
public void damageBug(jakemcdowell.blobsapplication.Game game) {
    damage += PlayerData.damageIncreasePerLevel.get(1).get(PlayerData.damageIncreaseLevel);
    addDamage(1);
    decreaseHpProgressBar();
    if (isKnockedOut()) {
        resetAfterKnockedOut();
        game.updateLevelKnockOutProgressBar();
        beeperHandle.cancel(true);
        beenThrough = false;
        if (isDead()) {
            pauseDeath(game);
            game.addBugKilledInLevel();
        }else {
            pauseKnockout();
        }
    }else {
        move();
    }
}