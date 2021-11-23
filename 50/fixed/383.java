public void reset() {
    mayAct = !(isLockedIntoCombat());
    history.clear();
}