public void newTurn() {
    mana.rebase(((mana.base()) + 1));
    mana.reset();
    mana.alter((-(overloadMana.value())));
    if ((mana.value()) < 0) {
        mana.set(0);
    }
    draw(1);
    field.updateSleepTimes();
    field.updateFreezeTimes();
    field.resetAttackCapacities();
}