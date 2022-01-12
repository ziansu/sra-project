static void redo() {
    if ((maud.History.checkpoints.size()) > ((maud.History.nextIndex) + 1)) {
        (maud.History.nextIndex)++;
        maud.Checkpoint next = maud.History.checkpoints.get(maud.History.nextIndex);
        next.restore();
        maud.History.logger.log(java.util.logging.Level.INFO, "redo to [{0}]", maud.History.nextIndex);
    }else {
        maud.History.logger.log(java.util.logging.Level.INFO, "nothing to redo", maud.History.nextIndex);
    }
}