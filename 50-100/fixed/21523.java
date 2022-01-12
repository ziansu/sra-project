public void createPopulation(int size) {
    for (int i = 0; i < size; i++) {
        com.hkamran.ai.NeatNetwork network = ((com.hkamran.ai.NeatNetwork) (this.clone()));
        network.mutate();
        population.add(network);
    }
}