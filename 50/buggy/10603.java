private void initSource() throws java.lang.Exception {
    if ((dataLine) == null) {
        dataLine = javax.sound.sampled.AudioSystem.getSourceDataLine(af);
    }
}