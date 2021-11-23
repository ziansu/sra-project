public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    semaphore.CustomExecutionService executionService = new semaphore.CustomExecutionService(semaphore.App.SIZE);
    for (int i = 0; i < (semaphore.App.THREADS_NUMBER); i++) {
        executionService.submit(new semaphore.CustomRunnable(i));
    }
    executionService.shutdown();
}