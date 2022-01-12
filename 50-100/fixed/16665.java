public void startSendingMessage(java.lang.String message, long seconds) {
    this.ticksRemaining = seconds;
    this.message = message;
    this.ticksRemaining = seconds;
    this.countdown = seconds > (-1);
    this.message = message;
    cancel();
    jobId = com.google.common.base.Optional.of(org.bukkit.Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this, 0, 20));
}