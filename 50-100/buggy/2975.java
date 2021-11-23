@java.lang.Override
public boolean acceptNewState(double originalScore, double newScore, double temperature) {
    if (newScore >= originalScore) {
        return true;
    }
    double probability = java.lang.Math.exp(((originalScore - newScore) / temperature));
    return (random.nextLong()) < probability;
}