@java.lang.Override
protected void drawSpecial(android.graphics.Canvas canvas, int offset) {
    for (com.gmail.wazappdotgithub.ships.model.IShip s : com.gmail.wazappdotgithub.ships.model.Client.RemoteClient.getInstance().getBoard().arrayOfShips()) {
        drawShip(canvas, offset, s);
    }
    for (com.gmail.wazappdotgithub.ships.model.Bomb b : com.gmail.wazappdotgithub.ships.model.Client.RemoteClient.getInstance().requestInTurnClientHistoricalBombs(DataAccess.REMOTE)) {
        drawBomb(canvas, b, offset);
    }
    for (com.gmail.wazappdotgithub.ships.model.Bomb b : delayedBombs) {
        drawNewBomb(canvas, b, offset);
    }
}