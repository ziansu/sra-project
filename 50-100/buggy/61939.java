@java.lang.Override
public void create() {
    com.mygdx.game.utils.SaveMngr.generateVanityJSON();
    names = com.mygdx.game.Main.getViewportNames();
    com.mygdx.game.stages.GameScreenScript.fpc = com.mygdx.game.utils.SaveMngr.loadStats();
    com.mygdx.game.Main.stage = new com.mygdx.game.stages.GameStage();
    viewports = com.mygdx.game.Main.getViewports(com.mygdx.game.Main.stage.getCamera());
    com.mygdx.game.Main.stage.setViewport(viewports.first());
    Gdx.input.setInputProcessor(com.mygdx.game.Main.stage);
}