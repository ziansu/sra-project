@java.lang.Override
public void create() {
    sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.THIS = this;
    Gdx.app.setApplicationLogger(new sk.tuke.gamedev.iddqd.tukequest.util.Log());
    sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.manager = loadAssets();
    setScreen(new sk.tuke.gamedev.iddqd.tukequest.screens.MenuScreen(this));
    TaskManager.INSTANCE.scheduleTimer(null, 1, () -> sk.tuke.gamedev.iddqd.tukequest.TukeQuestGame.debug = true);
    java.lang.System.out.println((("Game " + (this)) + " created"));
}