protected java.util.Set<org.spongepowered.api.scheduler.Task> getScheduledTasks() {
    synchronized(this.taskMap) {
        return new java.util.HashSet(this.taskMap.values());
    }
}