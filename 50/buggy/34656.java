@java.lang.SuppressWarnings(value = "synthetic-access")
void killOrMarkAsKilled() {
    synchronized(this) {
        this.isKilled = true;
        if ((this.state.get()) != (OwnerState.NEW)) {
            killOwner(this);
        }
    }
}