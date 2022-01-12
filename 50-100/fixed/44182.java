void getPubSpkr(java.io.OutputStream outputStream) throws java.io.IOException, java.lang.InterruptedException, javax.sound.sampled.LineUnavailableException {
    int micInt = MicList.getSelectedIndex();
    int speakerInt = SpeakerList.getSelectedIndex();
    javax.sound.sampled.TargetDataLine mic = getMic(micInt);
    javax.sound.sampled.SourceDataLine speaker = getSpeaker(speakerInt);
    chatter = new soundplay.SoundWindow.PublicSpeaker(mic, speaker, outputStream);
    chatterThread = new java.lang.Thread(((soundplay.SoundWindow.PublicSpeaker) (chatter)));
    chatterThread.start();
}