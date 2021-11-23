public levelGenerators.jaspGeneticLevelGenerator.Individual clone() {
    levelGenerators.jaspGeneticLevelGenerator.Individual clone = new levelGenerators.jaspGeneticLevelGenerator.Individual();
    for (int row = 0; row < (height); row++) {
        for (int col = 0; col < (width); col++) {
            clone.level[row][col] = this.level[row][col];
        }
    }
    clone.initializeControllers();
    return clone;
}