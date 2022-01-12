public void DeadLockAbort() throws java.io.IOException {
    this.blockbit = false;
    while (!((this.getCommand().equals(Command.ABORT)) || (this.getCommand().equals(Command.COMMIT))))
        loadNextLine();
    
    Abort();
    loadNextLine();
}