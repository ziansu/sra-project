@java.lang.Override
public void run() {
    runActions();
    running = false;
    if ((cb) != null) {
        cb.complete(this.id, this.ruleId, state);
    }
}