public void run() {
    try {
        javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip();
        java.net.URL audioUrl = java.lang.ClassLoader.getSystemResource(Game.musicFile);
        java.io.File audioFile = new java.io.File(audioUrl.toURI());
        javax.sound.sampled.AudioInputStream inputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(audioFile);
        clip.open(inputStream);
        clip.start();
        clip.loop(javax.sound.sampled.Clip.LOOP_CONTINUOUSLY);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Can't play sound, check file path");
    }
}