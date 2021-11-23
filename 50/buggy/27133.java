private void audioSetup() {
    try {
        mp3 = new MP3();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.exit(127);
    }
    mp3.play();
}