public void tryInvoke(long currentTime) throws java.lang.Throwable {
    if (((lastExecuteTime) == 0) || (currentTime <= ((lastExecuteTime) + (interval)))) {
        try {
            invoker.invoke(null);
        } finally {
            lastExecuteTime = currentTime;
        }
    }
}