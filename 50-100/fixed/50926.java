public void exec(h2o.utils.reliable.ReliableExecutor executor) {
    for (int i = 1; i <= (tryTimes); i++) {
        try {
            if (executor.exec(i)) {
                break;
            }
        } catch (java.lang.Exception e) {
            if (!(executor.exceptionHandler(i, e))) {
                break;
            }
        }
        try {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(tryInterval);
        } catch (java.lang.Exception e1) {
        }
    }
}