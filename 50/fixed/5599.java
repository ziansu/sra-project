public void startNewGame() {
    de.mash1t.battleships.Main.enemyBoard = new de.mash1t.battleships.EnemyBoard(de.mash1t.battleships.gui.boards.Board.fieldCountSquare, this.pEnemy);
    de.mash1t.battleships.Main.ownBoard = new de.mash1t.battleships.OwnBoard(de.mash1t.battleships.gui.boards.Board.fieldCountSquare, this.pOwn, de.mash1t.battleships.Main.shipList);
    de.mash1t.battleships.Main.ownBoard.setShips(de.mash1t.battleships.Main.shipList);
    de.mash1t.battleships.Main.enemyBoard.disablePanel();
}