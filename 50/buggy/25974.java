public static void load(com.gameapp.gameapp.Game game) {
    com.gameapp.gameapp.Assets.theme = game.getAudio().createMusic("menutheme.mp3");
    com.gameapp.gameapp.Assets.theme.setLooping(true);
    com.gameapp.gameapp.Assets.theme.setVolume(0.85F);
    com.gameapp.gameapp.Assets.theme.play();
}