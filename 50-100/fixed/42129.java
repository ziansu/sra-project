private void evaluateThreats() {
    for (int row = 0; row < 8; row++)
        for (int col = 0; col < 8; col++) {
            whiteCoverageValue += whitePieceReach(row, col);
            blackCoverageValue += blackPieceReach(row, col);
        }
    
}