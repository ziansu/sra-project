public boolean isFinished() {
    return ((started) && (!(aborted))) && ((threadPoolTaskHandler) == null);
}