public static void playShootingClip() {
    if ((Main.SoundPlayer.shootingClip) == null) {
        try {
            Main.SoundPlayer.shootingClip = new javafx.scene.media.AudioClip("file:Resources/Sound/shoot.wav");
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(e.toString());
        }
    }
    Main.SoundPlayer.shootingClip.play();
}