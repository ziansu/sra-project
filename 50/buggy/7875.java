public void stop() {
    started = false;
    mixer.cancel();
}