@java.lang.Override
public void run() {
    mPlaying = false;
    if (cb != null) {
        cb.run();
    }
}