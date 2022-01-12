public void takeMagicDamage(int damage) throws Unit.UnitIsDeadException {
    if ((currentUnit.getCurrentHP()) <= damage) {
        currentUnit.setCurrentHP(0);
        currentUnit.notifyObservers();
        currentUnit.notifyObservable();
        return ;
    }
    currentUnit.setCurrentHP(((currentUnit.getCurrentHP()) - damage));
}