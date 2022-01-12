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
            return true;
        }
    
    return false;
}