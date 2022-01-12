public void playSound(java.lang.String effectName) {
    if (enabled) {
        try {
            javax.sound.sampled.AudioInputStream audioInputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(new java.io.File(effectName).getAbsoluteFile());
            clip = javax.sound.sampled.AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (java.lang.Exception ex) {
        }
    }
}