@java.lang.Override
public void create() {
    java.lang.System.out.println(("onCreate " + (java.lang.Thread.currentThread().getId())));
    this.currentGameState = new nl.tudelft.ti2806.riverrush.game.LoadingGameState(this.dispatcher, this.assets, this);
}