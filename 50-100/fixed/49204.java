public static void startStopwatch(final ru.spbstu.ptime.constructor.TimeController controller, final ru.spbstu.ptime.constructor.ViewUpdater<java.lang.Long> updater) {
    long currentTime = java.lang.System.currentTimeMillis();
    ru.spbstu.ptime.constructor.TimeCounter counter = new ru.spbstu.ptime.constructor.TimeCounter(currentTime, 30, ru.spbstu.ptime.constructor.TimeEngine.mHandler) {
        @java.lang.Override
        public void onUpdateTime() {
            updater.updateView(((getCurrentTime()) - (getStartTime())));
        }

        @java.lang.Override
        public void onFinished() {
            updater.updateView(0L);
        }
    };
    controller.setTimeCounter(counter);
    ru.spbstu.ptime.constructor.TimeEngine.mThreadPool.execute(counter);
}