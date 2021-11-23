@java.lang.Override
public void run() {
    while ((timerValue) > 0) {
        i8080.Presenter.ControlView.updateState();
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
        }
        synchronized(this) {
            (timerValue)--;
        }
    } 
}