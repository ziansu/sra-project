protected void updateGBest() {
    for (int i = 0; i < (swarm.size()); i++) {
        core.PSO_Particle p = swarm.get(i);
        if ((utils.Parameters.PSO_GBEST_FIRST_ITERATION) && (i == 0)) {
            globalBestSwarm = p;
            globalBestSwarmFitness = p.getParFitness();
            utils.Parameters.PSO_GBEST_FIRST_ITERATION = false;
        }else {
            if ((p.getParFitness()) < (globalBestSwarmFitness)) {
                globalBestSwarm = p;
                globalBestSwarmFitness = globalBestSwarm.getParFitness();
            }
        }
    }
}