@java.lang.Override
public void onClick(android.view.View v) {
    if (running) {
        vb.cancel();
        pulseAnimation.cancel();
    }else {
        vb.vibrate(vibrator, (-1));
        pulseAnimation.start();
    }
    running = !(running);
}