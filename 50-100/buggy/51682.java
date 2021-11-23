public double update(double startSoundTime) {
    double soundTime = startSoundTime;
    next(soundTime);
    while (savePattern) {
        for (int i = 0; i < (main.FileRecorder.CHANELS); i++) {
            boolean change = chanels[i].update();
            if (change) {
                soundTime = chanels[i].getLastSoundTime();
                next(soundTime);
                i = 0;
            }
        }
    } 
    return soundTime;
}