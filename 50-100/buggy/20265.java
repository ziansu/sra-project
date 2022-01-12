public bitSequence.Member[] initiatePopulation(int N) {
    bitSequence.Member[] population = new bitSequence.Member[N];
    for (int i = 0; i < N; i++) {
        population[i] = new bitSequence.Member(5);
    }
    return population;
}