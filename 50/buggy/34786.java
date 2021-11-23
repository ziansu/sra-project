@org.junit.Before
public final void setUp() {
    timerStore = cg.group4.util.timer.TimerStore.getInstance();
    timer = new cg.group4.util.timer.Timer("TEST", 60);
}