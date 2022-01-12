private void doStepTo(int targetFieldindex, int oldPosIndex) {
    dungeon.Position newPos = getRoom().getPositions()[targetFieldindex];
    this.lookDir = dungeon.Position.getDirFromTo(pos.getIndex(), targetFieldindex);
    pos.figureLeaves();
    newPos.setFigure(this);
    figure.percept.Percept p = new figure.percept.StepPercept(this, oldPosIndex, targetFieldindex);
    getRoom().distributePercept(p);
    pos = newPos;
}