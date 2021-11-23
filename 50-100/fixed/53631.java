public void run() {
    try {
        isom3320.Main.clip = javax.sound.sampled.AudioSystem.getClip();
        javax.sound.sampled.AudioInputStream inputStream = javax.sound.sampled.AudioSystem.getAudioInputStream(isom3320.Main.class.getResourceAsStream(("/res/" + url)));
        isom3320.Main.clip.open(inputStream);
        isom3320.Main.clip.start();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println((("Can't find " + url) + "!"));
    }
}