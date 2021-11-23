public static void load(java.lang.String file) {
    try {
        javax.sound.sampled.AudioInputStream audioInputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(new java.io.File(file).getAbsoluteFile());
        jrad.util.Music.music = javax.sound.sampled.AudioSystem.getClip();
        jrad.util.Music.music.loop(5);
        jrad.util.Music.music.open(audioInputStream);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("Error with loading sound.");
        ex.printStackTrace();
    }
}