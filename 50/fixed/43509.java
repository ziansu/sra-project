public boolean upgradeTower() {
    if ((upgrade_level) < (MAX_UPGRADE_LEVEL)) {
        (upgrade_level)++;
        setChanged();
        notifyObservers();
        return true;
    }
    return false;
}