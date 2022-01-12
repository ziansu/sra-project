public static void main(java.lang.String[] args) {
    net.posick.concurrency.comcast.ExecutionScheduler scheduler = new net.posick.concurrency.comcast.ExecutionSchedulerImpl();
    for (int index = 0; index < (net.posick.concurrency.comcast.Main.NUMBER_OF_THREADS); index++) {
        scheduler.submit(() -> {
            java.util.Date now = new java.util.Date();
            System.out.println((((("Default Time = " + (now.toString())) + "\t-\t") + "ISO Time = ") + (net.posick.concurrency.comcast.Main.ISO_FORMATTER.format(now))));
        });
    }
    scheduler.start();
}