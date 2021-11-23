@java.lang.Override
protected void onLoadDone() {
    com.fcc.pong.assets.AssetPaths.setGamePlay(GameManager.INSTANCE.getAtlas());
    com.fcc.pong.assets.AssetDescriptors.setGamePlay();
    assetManager.load(AssetDescriptors.GAME_PLAY);
    assetManager.finishLoading();
    soundController = new com.fcc.pong.common.SoundController(game.getAssetManager());
    ((com.fcc.pong.PongGame) (game)).setSoundController(soundController);
    game.setScreen(new com.fcc.pong.screen.banner.BannerScreen(game));
}