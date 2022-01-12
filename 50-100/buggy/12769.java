public biomorphHandling.Biomorph evolveClo(biomorphHandling.Biomorph father, biomorphHandling.Biomorph mother) {
    biomorphHandling.Evolver ec = new biomorphHandling.Evolver(father, mother, perfectValues);
    biomorphHandling.Biomorph biomorph = ec.evolve();
    statisticMachine.saveGeneValues(ec.getChildGenes());
    statisticMachine.printRunningStats();
    biomorphCollection.addFirst(biomorph);
    createAndAdd();
    return biomorph;
}