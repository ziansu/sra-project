public static void main(java.lang.String[] args) throws java.io.IOException {
    java.util.concurrent.ScheduledThreadPoolExecutor threadPoolExe = new java.util.concurrent.ScheduledThreadPoolExecutor(5);
    com.saymtfmtfmtf.runnables.Time time = new com.saymtfmtfmtf.runnables.Time();
    com.saymtfmtfmtf.view.Interface inter = new com.saymtfmtfmtf.view.Interface(time);
    threadPoolExe.scheduleWithFixedDelay(time, 1, 1, java.util.concurrent.TimeUnit.SECONDS);
    threadPoolExe.scheduleWithFixedDelay(inter, 1, 1, java.util.concurrent.TimeUnit.SECONDS);
    new java.lang.Thread(inter).start();
}