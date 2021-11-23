public void update(twop.Player firstPlayer, twop.Player secondPlayer) {
    if (collidesCircle(firstPlayer)) {
        myIsDead = true;
        firstPlayer.applyHealing(twop.item.HealthPack.myHealing);
        new twop.sound.Sound("healthpackage").play();
    }
    if (collidesCircle(secondPlayer)) {
        myIsDead = true;
        new twop.sound.Sound("healthpackage").play();
    }
}