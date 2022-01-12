@org.junit.Test
public void whenCheckinFitnessForModuleListWithNullEntries_thenIgnoreNullEntries() {
    final java.util.List<org.corpus_tools.pepper.common.ModuleFitness> fitnesses = new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(java.util.Arrays.asList(org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class), null, org.mockito.Mockito.mock(org.corpus_tools.pepper.modules.PepperModule.class)));
    org.assertj.core.api.Assertions.assertThat(fitnesses.size()).isEqualTo(2);
}