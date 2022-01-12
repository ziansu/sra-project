public org.alopex.hyperios.helix.Specimen crossover(org.alopex.hyperios.helix.Specimen mateOne, org.alopex.hyperios.helix.Specimen mateTwo) {
    org.alopex.hyperios.helix.Specimen output = new org.alopex.hyperios.helix.Specimen(true);
    for (int i = 0; i < (output.getGenes().length); i++) {
        if ((java.lang.Math.random()) <= (GASettings.crossoverRate)) {
            output.setGene(i, mateOne.getGenes()[i]);
        }else {
            output.setGene(i, mateOne.getGenes()[i]);
        }
    }
    return output;
}