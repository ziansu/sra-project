public boolean isLastOrderedMovementEnded() {
    boolean isFinished = ((this.asservInterface.getQueueSize()) == 0) && ((this.asservInterface.getAsservStatus()) == (AsservInterface.AsservStatus.STATUS_IDLE));
    if (isFinished) {
        gotoQueue.clear();
    }
    return isFinished;
}