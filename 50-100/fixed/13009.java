public void run() {
    try {
        javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip();
        javax.sound.sampled.AudioInputStream inputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(java.lang.ClassLoader.getSystemResource(Game.musicFile));
        clip.open(inputStream);
        clip.start();
        clip.loop(javax.sound.sampled.Clip.LOOP_CONTINUOUSLY);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Can't play sound, check file path");
    }
}