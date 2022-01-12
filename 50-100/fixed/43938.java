public void safeStart() {
    if (((this.callbacks) != null) && ((this.callbacks.startCallback) != null))
        this.callbacks.startCallback.accept(this.task);
    
    this.started = true;
    this.task.start();
}