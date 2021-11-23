private static int calculateTripletScore(java.util.ArrayList<se.umu.dehu0004.greed.Die> dieList) {
    int total = 0;
    for (int i = 1; i <= 6; i++) {
        int points = se.umu.dehu0004.greed.GreedRules.calculateSingleTripletScore(i, dieList);
        total += points;
    }
    return total;
}