public javax.sound.sampled.Clip sound(java.lang.String location) {
    javax.sound.sampled.Clip clip = null;
    java.net.URL url = getClass().getResource(location);
    try {
        javax.sound.sampled.AudioInputStream ais = javax.sound.sampled.AudioSystem.getAudioInputStream(url);
        clip = javax.sound.sampled.AudioSystem.getClip();
        clip.open(ais);
    } catch (javax.sound.sampled.LineUnavailableException e) {
        e.printStackTrace();
    } catch (javax.sound.sampled.UnsupportedAudioFileException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return clip;
}