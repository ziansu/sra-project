public int getFitness(v3.GeneticTree tree) {
    int fitness = 0;
    for (v3.Grid.Cell cell : tree.getCells()) {
        fitness += 10;
        if ((cell.getState()) == (State.LEAF)) {
            fitness += cell.getLight();
            fitness += 40;
        }
    }
    return fitness;
}