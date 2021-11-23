private double getUtilityOfIncrement() {
    return (1 / (minReach)) * (integrate(minReach, (2 * (minReach))));
}