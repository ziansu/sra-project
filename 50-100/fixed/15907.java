private java.util.ArrayList<frogger.AssisterRow<frogger.Lily>> nextRoundLilyRows(java.util.ArrayList<frogger.AssisterRow<frogger.Lily>> prevLilies, frogger.Score score) {
    java.util.ArrayList<frogger.AssisterRow<frogger.Lily>> newLilies = new java.util.ArrayList<>();
    for (frogger.AssisterRow<frogger.Lily> x : prevLilies) {
        frogger.AssisterRow<frogger.Lily> newRow = x.nextObstacleRound(score);
        newLilies.add(newRow);
        java.lang.System.out.println("add row");
    }
    return newLilies;
}