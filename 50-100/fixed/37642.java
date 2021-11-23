private final void recordAudio(boolean start) {
    if (start) {
        dispatcher.addAudioProcessor(pitch);
    }else {
        dispatcher.removeAudioProcessor(pitch);
        controlMotor(((byte) (0)), ((byte) (0)));
    }
}