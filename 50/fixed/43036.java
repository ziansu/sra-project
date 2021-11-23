public void addShip(xbhs.battleship.game.Ship ship) throws xbhs.battleship.game.ShipAlreadyThereException {
    if ((this.ship) == null) {
        this.ship = ship;
    }else {
        throw new xbhs.battleship.game.ShipAlreadyThereException();
    }
}