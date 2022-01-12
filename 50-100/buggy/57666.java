private void generateAllAcrossMoves() {
    calculateCrossChecksAndAnchors();
    for (int x = 0; x < (bar.board.WIDTH); x++) {
        for (int y = 0; y < (bar.board.HEIGHT); y++) {
            if (!(isAnchor(x, y)))
                continue;
            
            if (ScrabbleGame.print)
                java.lang.System.out.println(("Anchor: " + (new Position(x, y).toString())));
            
            generateAllMovesFromAnchor(x, y);
        }
    }
}