public void backgroundMusic() {
    if ((project.equationinvasion.MainActivity.playing) == 0) {
        project.equationinvasion.MainActivity.BGM = android.media.MediaPlayer.create(this, R.raw.bgm1);
        project.equationinvasion.MainActivity.BGM.setLooping(true);
        project.equationinvasion.MainActivity.BGM.start();
    }
    if (project.equationinvasion.MainActivity.BGM.isPlaying()) {
        project.equationinvasion.MainActivity.playing = 1;
    }
}