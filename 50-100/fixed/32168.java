void initApp() {
    net.thesilkminer.arduino.kloc.util.Scheduler.getInstance().scheduleTask(() -> {
        SplashLoader.IT.updateProgressBar((-1), "Preparing application...");
        net.thesilkminer.arduino.kloc.util.Scheduler.getInstance().scheduleTask(() -> {
        }, 4500);
    }, 5, java.util.concurrent.TimeUnit.SECONDS);
}