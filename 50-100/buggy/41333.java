private boolean applyExponentialStrategy(double actualOdd, double playerOddBelief, double playerBeliefDegree, double initialOdd) {
    if (actualOdd <= playerOddBelief) {
        return true;
    }else {
        java.util.Random r = new java.util.Random();
        int probability = (r.nextInt(99)) + 1;
        double increments = (actualOdd - initialOdd) * 100;
        double playerExponentialBeliefDegree = java.lang.Math.pow(playerBeliefDegree, increments);
        return probability >= playerExponentialBeliefDegree;
    }
}