@java.lang.Override
public void cancelJoinGame() {
    this.game = null;
    this.shouldShowGameList = true;
    this.colorsTaken = null;
    getJoinGameView().showModal();
}