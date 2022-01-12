public void newGame() {
    this.cluedo = new cluedo.GameOfCluedo(this);
    this.canvas.addBoard(this.cluedo.getBoard());
    this.cluedo.setupPlayers();
    this.mouse.addGame(this.cluedo);
    this.cluedo.startGame();
}