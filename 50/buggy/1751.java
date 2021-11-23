protected final void finishCommand() {
    executing = false;
    finished = true;
    this.notifyAll();
}