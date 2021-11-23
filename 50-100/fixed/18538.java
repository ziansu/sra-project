public battleships.logic.Ship play(int x, int y) {
    battleships.logic.Ship ship;
    if ((inTurn) instanceof battleships.ai.Ai) {
        battleships.ai.Ai ai = ((battleships.ai.Ai) (inTurn));
        int[] c = ai.getShootingCoordinates();
        x = c[0];
        y = c[1];
    }
    ship = opponent.shoot(x, y);
    giveFeedBack(ship, x, y);
    return ship;
}