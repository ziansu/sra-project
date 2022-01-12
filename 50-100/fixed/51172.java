public void newGame() {
    this.cluedo = new cluedo.GameOfCluedo(this);
    this.canvas.addBoard(this.cluedo.getBoard());
    this.cluedo.setupPlayers();
    if ((this.cluedo) == null) {
        return ;
    }
    this.mouse.addGame(this.cluedo);
    this.cluedo.startGame();
}