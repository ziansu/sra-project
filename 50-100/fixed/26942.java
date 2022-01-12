@java.lang.Override
public void damageBug(jakemcdowell.blobsapplication.Game game) {
    addDamage(PlayerData.damageIncreasePerLevel.get(1).get(PlayerData.damageIncreaseLevel));
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