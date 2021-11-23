public void safeStart() {
    this.started = true;
    this.task.start();
    if (((this.callbacks) != null) && ((this.callbacks.startCallback) != null))
        this.callbacks.startCallback.accept(this.task);
    
}