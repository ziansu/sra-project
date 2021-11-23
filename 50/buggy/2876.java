public double getFitness(lightpos.light[] solution) {
    return ((getFitnessHelper(getLightGrid(solution))) / (nNumber)) * (getSolutionWatts(solution));
}