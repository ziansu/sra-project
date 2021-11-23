@java.lang.Override
public java.lang.Integer fitnessFunction(final org.jenetics.Genotype<org.jenetics.IntegerGene> gt) {
    final int[] chordProg = MusicAPI.virtuouso.models.genetic.GeneticAlgorithm.genotypeToIntArray(gt);
    int score = 0;
    for (int count = 0; count < ((chordProg.length) - 1); count++) {
        if (((MusicAPI.virtuouso.weights.DegreeWeights.getCommon(((chordProg[count]) - 1), (count + 1))) - 1) == 1)
            score++;
        
    }
    return score;
}