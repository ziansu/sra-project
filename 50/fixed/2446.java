private double probFromRank(double rank, double popsize) {
    return rank / ((popsize * (popsize + 1)) / 2);
}