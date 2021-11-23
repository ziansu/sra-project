@java.lang.Override
public void run() {
    if (Clock.Stopwatch.stoptimer) {
        java.lang.System.out.println((("The stopwatch finished at: " + (elapsedmilliseconds)) + "milliseconds"));
        timer.cancel();
    }
}