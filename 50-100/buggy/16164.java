@java.lang.Override
public double evaluateFitness(evolver.RunEvolutionContext runEvolutionContext, chromosome.ChromosomeRepresentationInterface chromosome) throws java.lang.Exception {
    java.lang.String result = ci.getProblem().evaluateFitness(runEvolutionContext, chromosome);
    if ((result.split(",").length) > 1) {
        synchronized(this) {
            fitness.multiObjective.ParetoRankEvaluator.ranks.add(result);
        }
        chromosome.setMetaData(result);
    }else {
        throw new java.lang.Exception("Fitness value is in a wrong format!");
    }
    return java.lang.Double.POSITIVE_INFINITY;
}