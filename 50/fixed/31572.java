static double getFitness(final SimpleGA.Individual individual) {
    double fitness = 0;
    fitness = new UWSN_ResurfacingGA.ResurfacingSimulation().Run(SimpleGA.FitnessCalc.binaryToInteger(individual.getGeneString()));
    return fitness;
}