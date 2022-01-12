@java.lang.SuppressWarnings(value = "synthetic-access")
void killOrMarkAsKilled() {
    this.isKilled.set(true);
    if ((this.state.get()) != (OwnerState.NEW)) {
        killOwner(this);
    }
}