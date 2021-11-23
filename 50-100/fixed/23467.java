private void readAudioFormatData() {
    javax.sound.sampled.AudioFileFormat fileFormat;
    try {
        fileFormat = javax.sound.sampled.AudioSystem.getAudioFileFormat(file);
    } catch (javax.sound.sampled.UnsupportedAudioFileException | java.io.IOException e) {
        throw new at.fhtw.mcs.util.TrackFactory.UnsupportedFormatException(Format.WAV);
    }
    javax.sound.sampled.AudioFormat audioFormat = fileFormat.getFormat();
    this.numberOfChannels = audioFormat.getChannels();
}