public battleships.logic.Ship play(int x, int y) {
    battleships.logic.Ship ship;
    if ((inTurn) instanceof battleships.ai.Ai) {
        battleships.ai.Ai ai = ((battleships.ai.Ai) (inTurn));
        x = ai.getShootingCoordinates()[0];
        y = ai.getShootingCoordinates()[1];
    }
    ship = opponent.shoot(x, y);
    giveFeedBack(ship, x, y);
    return ship;
}