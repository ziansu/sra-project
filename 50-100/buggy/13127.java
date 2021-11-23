public org.alopex.hyperios.helix.Specimen tournamentSelect() {
    org.alopex.hyperios.helix.Population tournamentPop = new org.alopex.hyperios.helix.Population(((int) ((GASettings.populationSize) * (GASettings.tournamentRatio))), (-1));
    for (int i = 0; i < (tournamentPop.size); i++) {
        tournamentPop.addSpecimen(this.getSpecimen(((int) ((java.lang.Math.random()) * (this.size)))));
    }
    return tournamentPop.bestSpecimen();
}