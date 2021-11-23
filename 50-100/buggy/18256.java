static void redo() {
    if (maud.History.hasVulnerable()) {
        maud.Checkpoint next = maud.History.checkpoints.get(maud.History.nextIndex);
        next.restore();
        maud.History.logger.log(java.util.logging.Level.INFO, "redo to [{0}]", maud.History.nextIndex);
        (maud.History.nextIndex)++;
    }else {
        maud.History.logger.log(java.util.logging.Level.INFO, "nothing to redo", maud.History.nextIndex);
    }
}