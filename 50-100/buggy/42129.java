private void evaluateThreats() {
    int whiteValue = 0;
    int blackValue = 0;
    int whiteAdvantage = (activePlayerIsWhite) ? 1 : -1;
    for (int row = 0; row < 8; row++)
        for (int col = 0; col < 8; col++) {
            whiteCoverageValue += whitePieceReach(row, col);
            blackCoverageValue += blackPieceReach(row, col);
        }
    
}