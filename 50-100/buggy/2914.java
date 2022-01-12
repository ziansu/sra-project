public void processStreamInfo(org.jflac.metadata.StreamInfo streamInfo) {
    this.streamInfo = streamInfo;
    try {
        fmt = streamInfo.getAudioFormat();
        info = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, fmt, javax.sound.sampled.AudioSystem.NOT_SPECIFIED);
        line = ((javax.sound.sampled.SourceDataLine) (javax.sound.sampled.AudioSystem.getLine(info)));
        line.open(fmt, javax.sound.sampled.AudioSystem.NOT_SPECIFIED);
        line.start();
    } catch (javax.sound.sampled.LineUnavailableException e) {
        e.printStackTrace();
    }
}