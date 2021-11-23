@java.lang.Override
public boolean tick() {
    if (touch.isPressed()) {
        flicker.engage();
        initialHit = true;
        return false;
    }
    if ((initialHit) && (!(sw.isRecording()))) {
        sw.start();
    }else
        if ((initialHit) && ((sw.timeElapsed()) > (delay))) {
            flicker.stop();
            sw.stop();
            initialHit = false;
            return true;
        }
    
    return false;
}