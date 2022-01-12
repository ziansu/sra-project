public bitSequence.Member[] reproduction(bitSequence.Member[] fittest, int N) {
    bitSequence.Member[] breed = new bitSequence.Member[N];
    java.util.Random random = new java.util.Random();
    int filled = 0;
    while (filled < 10) {
        bitSequence.Member dad = fittest[random.nextInt(fittest.length)];
        bitSequence.Member mom = fittest[random.nextInt(fittest.length)];
        breed[(filled++)] = crossOver(dad, mom, 1);
    } 
    return breed;
}