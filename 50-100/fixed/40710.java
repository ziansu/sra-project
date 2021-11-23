@org.junit.Test
public void whenCheckingHealthForMultipleModules_thenReturnListOfFitnessValues() {
    org.corpus_tools.pepper.modules.PepperModule healthyModule = createHealthyModule();
    org.corpus_tools.pepper.modules.PepperModule criticalModule = createCriticalModule();
    java.util.List<org.corpus_tools.pepper.common.ModuleFitness> fitnesses = new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkHealth(java.util.Arrays.asList(healthyModule, criticalModule));
    org.assertj.core.api.Assertions.assertThat(fitnesses.get(0).getOverallFitness()).isEqualTo(Fitness.HEALTHY);
    org.assertj.core.api.Assertions.assertThat(fitnesses.get(1).getOverallFitness()).isEqualTo(Fitness.CRITICAL);
}