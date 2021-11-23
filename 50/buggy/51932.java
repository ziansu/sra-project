public void scoreRoadEndgame() {
    java.util.Set<edu.brown.cs.scij.game.Posn> meepledPosns = board.getMeeplePosns();
    for (edu.brown.cs.scij.game.Posn p : meepledPosns) {
        scoreRoadAt(p);
    }
}