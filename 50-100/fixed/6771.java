void update(gt.Population otherPop) {
    java.util.Enumeration<java.lang.String> players = fractions.keys();
    while (players.hasMoreElements()) {
        java.lang.String currentPlayer = players.nextElement();
        double updatedFraction = updateFraction(currentPlayer);
        fractions.put(currentPlayer, updatedFraction);
    } 
}