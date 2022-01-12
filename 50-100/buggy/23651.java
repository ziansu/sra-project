public int rouletteWheelSelection() {
    double offset = 0.0;
    double totalFitness = 0.0;
    for (Chromosome c : chromosomes) {
        totalFitness += c.getFitnessScore();
    }
    double randomizedSelection = totalFitness * (java.lang.Math.random());
    for (int x = 0; x < (chromosomes.size());) {
        offset += chromosomes.get(0).getFitnessScore();
        if (randomizedSelection < offset) {
            return x;
        }
    }
    return -1;
}