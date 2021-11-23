@java.lang.Override
public void run() {
    run = true;
    for (; ((a) < (steps)) && (run); (a)++) {
        java.lang.System.out.println(a);
        tick();
        notifyViews();
    }
    a = 0;
    run = false;
}