public void setTowerClass(java.lang.Class<? extends ch.logixisland.anuto.game.objects.Tower> clazz) {
    mTowerClass = clazz;
    if ((mTowerClass) != null) {
        setTower(newTower());
    }
}