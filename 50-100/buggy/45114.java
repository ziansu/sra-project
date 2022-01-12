public void takeMagicDamage(int damage) throws Unit.UnitIsDeadException {
    if ((currentUnit.getCurrentHP()) <= damage) {
        currentUnit.setCurrentHP(0);
        currentUnit.notifyObservers();
        currentUnit.notifyObservable();
        return ;
    }
    if (currentUnit.getIsDead()) {
        currentUnit.setCurrentHP(((currentUnit.getCurrentHP()) - (damage * 4)));
        return ;
    }
    currentUnit.setCurrentHP(((currentUnit.getCurrentHP()) - damage));
}