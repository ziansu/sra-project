public void stop() {
    if ((taskId) != (-1)) {
        plugin.getServer().getScheduler().cancelTask(taskId);
        taskId = -1;
    }
}