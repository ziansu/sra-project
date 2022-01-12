private double getUCTValue(nl.dke.boardgame.mcts.MonteCarloNode node) {
    double n = node.getVisits();
    double q = node.getqValues();
    if ((java.lang.Math.abs((n - 0))) < 1.0E-5) {
        return java.lang.Double.MAX_VALUE;
    }else {
        return (q / n) + ((explorationParameter) * (java.lang.Math.sqrt(((2 * (java.lang.Math.log(n))) / n))));
    }
}