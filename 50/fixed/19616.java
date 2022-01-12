public void p2SuddenDeath(int hpChange) {
    setDivider(((currentMax) + (hpChange - 1)));
    changeGameLength(hpChange);
}