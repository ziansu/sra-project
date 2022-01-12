protected final void finishCommand() {
    this.executing = false;
    this.finished = true;
    this.notifyAll();
}