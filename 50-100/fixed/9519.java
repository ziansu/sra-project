public void newGame() {
    frame = new se2aa4.morris.Frame();
    state = State.IN_PROGRESS;
    sel = Location.NONE;
    blueMillExists = false;
    redMillExists = false;
    redInventory = true;
    blueInventory = true;
    moved = false;
    removed = false;
    randTurn();
    randCpuPlayer();
    createRestorePoint();
    if ((turn) == (cpuPlayer)) {
        cpuMove();
        endTurn();
    }
}