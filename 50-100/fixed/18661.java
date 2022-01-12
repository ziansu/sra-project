private int treeFitness(v3.tree.genetic.GeneticTree tree) {
    int fitness = 10;
    for (v3.Grid.Cell cell : tree.getCells()) {
        if ((cell.getState()) == (v3.State.LEAF)) {
            fitness += cell.getLight();
        }
    }
    java.lang.System.out.println(tree.getCells().size());
    return fitness;
}