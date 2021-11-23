public void initialize() {
    song1 = Gdx.audio.newMusic(Gdx.files.internal("NARC.mp3"));
    song2 = Gdx.audio.newMusic(Gdx.files.internal("Rose the Wraith.mp3"));
    song3 = Gdx.audio.newMusic(Gdx.files.internal("ABIIISMO - Machine Uprising.mp3"));
    song3.play();
    song1.setVolume(0.2F);
    song1.setOnCompletionListener(new com.badlogic.gdx.audio.Music.OnCompletionListener() {
        @java.lang.Override
        public void onCompletion(com.badlogic.gdx.audio.Music music) {
            song1.play();
            song3.play();
        }
    });
}