public boolean isFinished() {
    return ((started) && (!(aborted))) && ((this.threadPoolTaskHandler) == null);
}