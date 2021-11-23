void initAiGame() {
    aiShips.setGameField(gameField);
    do {
        resetShipPlacement = false;
        aiShips.clearShipCoordinate();
        shipPlacementStage = 0;
        for (int value : shipCounter) {
            for (int a = value; a > 0; a--) {
                setupAi((a - 1));
                (shipPlacementStage)++;
                if (a == 1)
                    shipPlacementStage = 0;
                
            }
        }
    } while (resetShipPlacement );
    drawShips();
}