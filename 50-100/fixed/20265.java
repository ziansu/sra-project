public bitSequence.Member[] initiatePopulation(int N, int length) {
    bitSequence.Member[] population = new bitSequence.Member[N];
    for (int i = 0; i < N; i++) {
        population[i] = new bitSequence.Member(length);
    }
    return population;
}