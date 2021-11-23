protected void updateGBest() {
    for (int i = 0; i < (swarm.size()); i++) {
        if ((swarm.get(i).getParFitness()) < (globalBestSwarmFitness)) {
            globalBestSwarm = swarm.get(i);
            globalBestSwarmFitness = globalBestSwarm.getParFitness();
        }
    }
}