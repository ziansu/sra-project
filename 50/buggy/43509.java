public void upgradeTower() {
    if ((upgrade_level) < (MAX_UPGRADE_LEVEL)) {
        (upgrade_level)++;
        setChanged();
        notifyObservers();
    }
}