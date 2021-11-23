public void stop() {
    if (mRunning.compareAndSet(true, false)) {
        receive(new record.wave.RealBufferWaveRecorder.PoisonPill());
    }
}