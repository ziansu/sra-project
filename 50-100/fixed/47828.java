public double update() {
    double soundTime = 0;
    do {
        for (int i = 0; i < (com.chiptunetracker.core.FileRecorder.CHANELS); i++) {
            boolean change = chanels[i].update();
            if (change) {
                soundTime = chanels[i].getLastSoundTime();
                next(soundTime);
                i = 0;
            }
        }
    } while (savePattern );
    return soundTime;
}