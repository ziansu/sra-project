public void markTaskCompletion() {
    if (this.countDownLatch.isPresent()) {
        this.countDownLatch.get().countDown();
    }
    this.taskState.setProp(ConfigurationKeys.TASK_RETRIES_KEY, this.retryCount);
}