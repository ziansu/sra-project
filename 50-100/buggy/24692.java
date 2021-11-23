private void nextStep(final java.awt.Point lastPoint) {
    if (!(checkRemoveBlocks(lastPoint))) {
        populateField();
    }else {
        (linesLeft)--;
        if ((linesLeft) == 0) {
            (level)++;
            (numUndos)++;
            linesLeft = ch.bfh.sevennotseven.Game.linesPerLevel;
        }
    }
    oldScore.add(score);
    emitUpdateEvent();
}