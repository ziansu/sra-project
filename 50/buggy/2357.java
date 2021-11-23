public void playSound(java.lang.String sound) {
    if (isPlaySounds) {
        soundDictionary.get(sound).play();
        Gdx.app.log(sound, "played");
    }
}