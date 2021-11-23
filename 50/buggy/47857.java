@java.lang.Override
public java.lang.Double getResult() {
    double fitnessSum = 0.0;
    for (final SigmaEC.CircleOfLife.EvolutionResult<T> result : results)
        fitnessSum += result.getBestFitness();
    
    return fitnessSum / (results.size());
}