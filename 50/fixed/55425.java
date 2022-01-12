public void stopChancellor() {
    game.setMusic(Gdx.files.internal("music/FloatingCities.mp3"));
    actors.removeChancellor();
    actors.enableNextBtn();
}