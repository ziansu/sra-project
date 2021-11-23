protected void wait(int duration, java.lang.Runnable callBack) {
    executor.schedule(callBack, duration, java.util.concurrent.TimeUnit.MILLISECONDS);
}