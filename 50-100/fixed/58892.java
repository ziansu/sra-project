@java.lang.Override
public void create() {
    sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.THIS = this;
    Gdx.app.setApplicationLogger(new sk.tuke.gamedev.iddqd.tukequest.util.Log());
    sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.manager = loadAssets();
    setScreen(new sk.tuke.gamedev.iddqd.tukequest.screens.MenuScreen(this));
    java.lang.System.out.println((("Game " + (this)) + " created"));
}