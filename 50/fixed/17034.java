@java.lang.Override
public nl.tudelft.ti2806.riverrush.game.state.GameState stop() {
    this.screen.dispose();
    this.dispose();
    return new nl.tudelft.ti2806.riverrush.game.state.StoppedGameState(this.dispatcher, this.game);
}