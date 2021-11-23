public boolean needsWeaving() {
    synchronized(this.openBindingTasks) {
        return (!(this.openAccessTasks.isEmpty())) || (!(this.openBindingTasks.isEmpty()));
    }
}