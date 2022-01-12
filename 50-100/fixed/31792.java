@java.lang.Override
public void onClick(android.view.View v) {
    if (running) {
        vb.cancel();
        pulseAnimation.cancel();
    }else {
        pulseAnimation.start();
        vb.vibrate(vibrator, 0);
    }
    running = !(running);
}