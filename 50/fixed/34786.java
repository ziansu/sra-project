@org.junit.Before
public final void setUp() {
    timerStore = new cg.group4.util.timer.TimerStore();
    timer = new cg.group4.util.timer.Timer("TEST", 60);
}