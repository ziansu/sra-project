@java.lang.Override
public void run() {
    while (gameRunning) {
        if ((acc) >= (1000 / 30)) {
            performActions();
            model.step(acc);
            time = elapsedTime;
        }
        elapsedTime = java.lang.System.currentTimeMillis();
        acc = (elapsedTime) - (time);
    } 
}