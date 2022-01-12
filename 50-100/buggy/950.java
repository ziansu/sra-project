public biomorphHandling.Biomorph evolveClo(biomorphHandling.Biomorph father, biomorphHandling.Biomorph mother) {
    biomorphHandling.Evolver ec = new biomorphHandling.Evolver(father, mother, targetValues);
    biomorphHandling.Biomorph biomorph = ec.evolve();
    statisticMachine.saveGeneValues(ec.getChildGenes());
    statisticMachine.printRunningStats();
    createAndAdd();
    createAndAdd();
    return biomorph;
}