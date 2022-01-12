boolean runCheck() {
    double r = java.util.concurrent.ThreadLocalRandom.current().nextDouble();
    return (chance) > r;
}