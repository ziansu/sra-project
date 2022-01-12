public static void playClipWithVolume(java.lang.String fileName, double volume) {
    try {
        javafx.scene.media.AudioClip clip = new javafx.scene.media.AudioClip("file:Resources/Sound/");
        clip.setVolume(volume);
        clip.play();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
    }
}