protected java.util.Set<org.spongepowered.api.scheduler.Task> getScheduledTasks() {
    synchronized(this.taskMap) {
        return com.google.common.collect.Sets.newHashSet(this.taskMap.values());
    }
}