@java.lang.Override
public void run() {
    if (Clock.Stopwatch.stoptimer) {
        plr.sendMessage((("The stopwatch finished at: " + (elapsedseconds)) + "seconds"));
        timer.cancel();
    }
}