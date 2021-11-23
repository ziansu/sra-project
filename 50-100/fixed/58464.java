public static void main(java.lang.String[] args) {
    com.helpme.app.engine.base.Window.initWindow(com.helpme.app.Main.WINDOW_WIDTH, com.helpme.app.Main.WINDOW_HEIGHT, com.helpme.app.Main.WINDOW_TITLE);
    com.helpme.app.engine.base.Window.disableVSync();
    com.helpme.app.engine.base.Game game = new com.helpme.app.game.GameInstance();
    com.helpme.app.saveload.SaveLoad gameLoader = new com.helpme.app.saveload.GameLoader();
    com.helpme.app.engine.base.EngineCore engineCore = new com.helpme.app.engine.base.EngineCore(com.helpme.app.engine.renderer.base.RenderCore.getRenderCore(), game);
    new com.helpme.app.game.controller.SceneController(game, gameLoader, engineCore.getTime());
    engineCore.start();
    com.helpme.app.engine.sounds.audio.AudioHandler.cleanUp();
}