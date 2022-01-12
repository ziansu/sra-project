private final void recordAudio(boolean start) {
    if (start) {
        dispatcher.addAudioProcessor(pitch);
        refFreq = java.lang.Float.valueOf(((java.lang.String) (((android.widget.Spinner) (findViewById(R.id.spinner_freq))).getSelectedItem())));
    }else {
        dispatcher.removeAudioProcessor(pitch);
        freqFilter.clear();
        controlMotor(((byte) (0)), ((byte) (0)));
    }
}